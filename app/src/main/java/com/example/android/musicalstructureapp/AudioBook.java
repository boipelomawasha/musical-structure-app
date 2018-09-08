package com.example.android.musicalstructureapp;

public class AudioBook {

    /**
     * Title of the audiobook
     */
    private String aTitle;

    /**
     * Who narrated the audiobook
     */
    private String aNarratedBy;

    /**
     * Length of the audiobook
     */
    private String aLength;

    /**
     * Release date of the audiobook
     */
    private String aReleaseDate;

    /**
     * @param strTitle       Title of the audiobook
     * @param strNarratedBy  Who narrated the audiobook
     * @param strLength      Length of the audiobook
     * @param strReleaseDate Release date of the audiobook
     */

    public AudioBook(String strTitle, String strNarratedBy, String strLength, String strReleaseDate) {
        aTitle = strTitle;
        aNarratedBy = strNarratedBy;
        aLength = strLength;
        aReleaseDate = strReleaseDate;
    }

    /**
     * Get the title of the audiobook.
     */
    public String getTitle() {
        return aTitle;
    }

    /**
     * Get the title of the audiobook.
     */
    public String getNarratedBy() {
        return aNarratedBy;
    }

    /**
     * Get the length of the audiobook.
     */
    public String getLength() {
        return aLength;
    }

    /**
     * Get the release date of the audiobook.
     */
    public String getReleaseDate() {
        return aReleaseDate;
    }
}
