package io.github.pratikrane.contest.week176;

public class MaxEvents {
	public int maxEvents(int[][] events) {
		int maxEvents = 0;
		int lastEventDate = 0;
		for (final int[] event : events) {
			if (event[1] > lastEventDate) {
				lastEventDate = event[1];
			}
		}

		for (; lastEventDate > 0; lastEventDate--) {
			int eventIndex = 0;
			for (int i = 0; i < events.length; i++) {
				if (events[i][0] <= lastEventDate && lastEventDate <= events[i][1]) {
					if (events[i][1] > events[eventIndex][1]) {
						eventIndex = i;
					}
				}
			}
			{
				events[eventIndex][0] = -1;
				events[eventIndex][1] = -1;
				maxEvents++;
			}
		}
		return maxEvents;
	}

}
