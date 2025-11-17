package com.apptionlabs.meater_app.versions;

import java.util.Locale;

/* loaded from: /tmp/meat/meat/classes.dex */
public class Versions {
    public DevFirmwareVersions devFw;
    public VersionNodeApp app = new VersionNodeApp();
    public VersionNode amber = new VersionNode();
    public VersionNode block = new VersionNode();
    public VersionNode plus = new VersionNode();
    public VersionNode se = new VersionNode();
    public VersionNode plusV2 = new VersionNode();
    public VersionNode blockV2 = new VersionNode();

    public String toString() {
        Locale locale = Locale.US;
        VersionNodeApp versionNodeApp = this.app;
        String str = versionNodeApp.version;
        Integer valueOf = Integer.valueOf(versionNodeApp.permittedSkips);
        String str2 = this.app.news;
        VersionNode versionNode = this.plus;
        String str3 = versionNode.version;
        String str4 = versionNode.url;
        String str5 = versionNode.crc;
        VersionNode versionNode2 = this.block;
        String str6 = versionNode2.version;
        String str7 = versionNode2.url;
        VersionNode versionNode3 = this.plusV2;
        String str8 = versionNode3.version;
        String str9 = versionNode3.url;
        String str10 = versionNode3.crc;
        VersionNode versionNode4 = this.blockV2;
        return String.format(locale, "latestApp %s, skips %d, app news %s \n MeaterPlus %s %s %s \n Block %s %s", str, valueOf, str2, str3, str4, str5, str6, str7, str8, str9, str10, versionNode4.version, versionNode4.url);
    }
}
