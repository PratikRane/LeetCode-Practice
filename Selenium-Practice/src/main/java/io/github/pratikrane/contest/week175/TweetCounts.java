package io.github.pratikrane.contest.week175;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*Implement the class TweetCounts that supports two methods:

1. recordTweet(string tweetName, int time)

Stores the tweetName at the recorded time (in seconds).
2. getTweetCountsPerFrequency(string freq, string tweetName, int startTime, int endTime)

Returns the total number of occurrences for the given tweetName per minute, hour, or day (depending on freq) starting from the startTime (in seconds) and ending at the endTime (in seconds).
freq is always minute, hour or day, representing the time interval to get the total number of occurrences for the given tweetName.
The first time interval always starts from the startTime, so the time intervals are [startTime, startTime + delta*1>,  [startTime + delta*1, startTime + delta*2>, [startTime + delta*2, startTime + delta*3>, ... , [startTime + delta*i, min(startTime + delta*(i+1), endTime + 1)> for some non-negative number i and delta (which depends on freq).


Example:

Input
["TweetCounts","recordTweet","recordTweet","recordTweet","getTweetCountsPerFrequency","getTweetCountsPerFrequency","recordTweet","getTweetCountsPerFrequency"]
[[],["tweet3",0],["tweet3",60],["tweet3",10],["minute","tweet3",0,59],["minute","tweet3",0,60],["tweet3",120],["hour","tweet3",0,210]]

Output
[null,null,null,null,[2],[2,1],null,[4]]

Explanation
TweetCounts tweetCounts = new TweetCounts();
tweetCounts.recordTweet("tweet3", 0);
tweetCounts.recordTweet("tweet3", 60);
tweetCounts.recordTweet("tweet3", 10);                             // All tweets correspond to "tweet3" with recorded times at 0, 10 and 60.
tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 59); // return [2]. The frequency is per minute (60 seconds), so there is one interval of time: 1) [0, 60> - > 2 tweets.
tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 60); // return [2, 1]. The frequency is per minute (60 seconds), so there are two intervals of time: 1) [0, 60> - > 2 tweets, and 2) [60,61> - > 1 tweet.
tweetCounts.recordTweet("tweet3", 120);                            // All tweets correspond to "tweet3" with recorded times at 0, 10, 60 and 120.
tweetCounts.getTweetCountsPerFrequency("hour","tweet3",0,210); // return [4]. The frequency is per hour (3600 seconds), so there is one interval of time: 1) [0, 211> - > 4 tweets.*/
import java.util.TreeSet;

public class TweetCounts {

	public static void main(String[] args) {
		final TweetCounts tweetCounts = new TweetCounts();
		tweetCounts.recordTweet("tweet3", 0);
		tweetCounts.recordTweet("tweet3", 60);
		tweetCounts.recordTweet("tweet3", 10); // All tweets correspond to "tweet3" with recorded times at 0, 10 and 60.
		tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 59); // return [2]. The frequency is per minute
																			// (60 seconds), so there is one interval of
																			// time: 1) [0, 60> - > 2 tweets.
		System.out.println();
		tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 60); // return [2, 1]. The frequency is per
																			// minute
																			// (60 seconds), so there are two
																			// intervals
																			// of time: 1) [0, 60> - > 2 tweets, and
																			// 2)
																			// [60,61> - > 1 tweet.
		System.out.println();
		tweetCounts.recordTweet("tweet3", 120); // All tweets correspond to "tweet3" with recorded times at 0, 10, 60
												// and 120.
		tweetCounts.getTweetCountsPerFrequency("hour", "tweet3", 0, 210); // return [4]. The frequency is per hour (3600
																			// seconds), so there is one interval of
																			// time: 1) [0, 211> - > 4 tweets.*/
	}

	public Map<String, TreeSet<Integer>> map;

	public TweetCounts() {
		map = new HashMap<String, TreeSet<Integer>>();

	}

	private List<Integer> getFrequency(long inSeconds, String tweetName, int startTime, int endTime) {
		TreeSet<Integer> timeStamps = map.getOrDefault(tweetName, null);
		if (timeStamps == null) {
			timeStamps = new TreeSet<Integer>();
		}
		final List<Integer> freqs = new ArrayList<Integer>();

		for (int i = startTime; i <= endTime; i += inSeconds) {
			final int count = timeStamps.subSet(i, (int) Math.min(endTime + 1, i + inSeconds)).size();
			freqs.add(count);
		}
		return freqs;
	}

	public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
		switch (freq) {
		case "minute":
			return getFrequency(60, tweetName, startTime, endTime);
		case "hour":
			return getFrequency(3600, tweetName, startTime, endTime);
		case "day":
			return getFrequency(3600 * 24, tweetName, startTime, endTime);
		default:
			throw new IllegalArgumentException("Unexpected value: " + freq);
		}

	}

	public void recordTweet(String tweetName, int time) {
		TreeSet<Integer> timeStamps = map.getOrDefault(tweetName, null);
		if (timeStamps == null) {
			timeStamps = new TreeSet<Integer>();
			map.put(tweetName, timeStamps);
		}
		timeStamps.add(time);
	}
}

/**
 * Your TweetCounts object will be instantiated and called as such: TweetCounts
 * obj = new TweetCounts(); obj.recordTweet(tweetName,time); List<Integer>
 * param_2 = obj.getTweetCountsPerFrequency(freq,tweetName,startTime,endTime);
 */