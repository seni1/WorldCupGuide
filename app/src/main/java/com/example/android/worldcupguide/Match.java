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

    /** Image resource ID for the word */
    private int mImageResourceId;

    /**
     * Create a new Match object.
     * @param teamsPlaying
     * @param dateDayTime
     * @param imageResourceId
     */

    public Match (String teamsPlaying, String dateDayTime, int imageResourceId) {
        //Initializing the variables
        mTeamsPlaying = teamsPlaying;
        mDateDayTime = dateDayTime;
        //Added the imageResourceId
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the Teams method
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
     * Return the image resource ID of the match
     */

    public int getmImageResourceId() {
        return mImageResourceId;
    }

}
