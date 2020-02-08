package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * District point contributions and breakdown for a team at an event
 */
@Value
public class EventPoints {
	/**
	 * @return TBA Event key for this event.
	 */
	String event_key;
	/**
	 * @return <code>true</code> if this event is a District Championship event
	 */
	boolean district_cmp;
	/**
	 * @return Points awarded for alliance selection
	 */
	int alliance_points;
	/**
	 * @return Points awarded for event awards.
	 */
	int award_points;
	/**
	 * @return Points awarded for qualification match performance.
	 */
	int qual_points;
	/**
	 * @return Points awarded for elimination match performance.
	 */
	int elim_points;
	/**
	 * @return Total points awarded at this event.
	 */
	int total;

}