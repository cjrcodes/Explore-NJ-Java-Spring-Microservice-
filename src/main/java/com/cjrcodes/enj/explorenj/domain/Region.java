package com.cjrcodes.enj.explorenj.domain;


/**
 * Enumeration of the region of California.
 *
 * Created by Mary Ellen Bowman
 */
public enum Region {
    Central_Jersey("Central Jersey"), Southern_Jersey("Southern Jersey"), Northern_Jersey("Northern Jersey"), Varies("Varies");
    private String label;
    private Region(String label) {
        this.label = label;
    }
    public static Region findByLabel(String byLabel) {
        for(Region r: Region.values()) {
            if (r.label.equalsIgnoreCase(byLabel))
                return r;
        }
        return null;
    }
}
