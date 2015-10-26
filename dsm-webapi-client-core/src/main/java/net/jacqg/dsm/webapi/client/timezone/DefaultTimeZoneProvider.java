package net.jacqg.dsm.webapi.client.timezone;

import java.util.TimeZone;

public class DefaultTimeZoneProvider implements TimeZoneProvider {

    @Override
    public TimeZone getTimeZone() {
        return TimeZone.getDefault();
    }
}
