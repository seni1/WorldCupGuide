package com.example.android.worldcupguide;

/**
 * Created by SeniKamara on 04.04.2018.
 * {@link Match} represents a match that the user wants to watch or enquire about.
 * It contains the names of the teams participating in the match as well as the date
 * and time when the match is played, as well as the button to view the information
 * about the venue for the match.
 */

public class Match {

    /** Teams that are playing the match */
    private String mTeamsPlaying;

    /** Date, day and time the match is played */
    private String mDateDayTime;

    /** Venue where the match is played */
    private String mVenuePlaying;

    /** Image resource ID for the word */
    private int mImageResourceId;

    /**
     * Create a new Match object.
     * @param teamsPlaying
     * @param dateDayTime
     * @param imageResourceId
     * @param venuePlaying
     */

    public Match (String teamsPlaying, String dateDayTime, String venuePlaying, int imageResourceId) {
        //Initializing the variables
        mTeamsPlaying = teamsPlaying;
        mDateDayTime = dateDayTime;
        mVenuePlaying = venuePlaying;
        //Added the imageResourceId
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the TeamsPlaying method
     */

    public String getTeamsPlaying() {
        return mTeamsPlaying;
    }

    /**
     * Get the DateDayTime method
     */

    public String getDateDayTime() {
        return mDateDayTime;
    }

    /**
     * Get the VenuePlaying method
     */

    public String  getVenuePlaying() {
        return mVenuePlaying;
    }

    /**
     * Return the image resource ID of the match
     */

    public int getmImageResourceId() {
        return mImageResourceId;
    }

}
