package com.stelmashok.jsonparser.bean;

import java.util.Objects;

public class Platform {
    Boolean windows;
    Boolean macOS;
    Boolean steamOS;
    Boolean remixeMusic;

    public Platform(Boolean remixeMusic) {
        this.remixeMusic = remixeMusic;
    }

    public Platform(Boolean windows, Boolean macOS) {
        this.windows = windows;
        this.macOS = macOS;
    }

    public Platform(Boolean windows, Boolean macOS, Boolean steamOS) {
        this.windows = windows;
        this.macOS = macOS;
        this.steamOS = steamOS;
    }

    public Boolean getWindows() {
        return windows;
    }

    public void setWindows(Boolean windows) {
        this.windows = windows;
    }

    public Boolean getMacOS() {
        return macOS;
    }

    public void setMacOS(Boolean macOS) {
        this.macOS = macOS;
    }

    public Boolean getSteamOS() {
        return steamOS;
    }

    public void setSteamOS(Boolean steamOS) {
        this.steamOS = steamOS;
    }

    public Boolean getRemixeMusic() {
        return remixeMusic;
    }

    public void setRemixeMusic(Boolean remixeMusic) {
        this.remixeMusic = remixeMusic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Platform)) return false;
        Platform platform = (Platform) o;
        return Objects.equals(getWindows(), platform.getWindows()) && Objects.equals(getMacOS(), platform.getMacOS()) && Objects.equals(getSteamOS(), platform.getSteamOS()) && Objects.equals(getRemixeMusic(), platform.getRemixeMusic());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWindows(), getMacOS(), getSteamOS(), getRemixeMusic());
    }

    @Override
    public String toString() {
        return "Platform{" +
                "windows=" + windows +
                ", macOS=" + macOS +
                ", steamOS=" + steamOS +
                ", remixeMusic=" + remixeMusic +
                '}';
    }
}
