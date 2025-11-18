package cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords;

/* loaded from: classes.dex */
public enum Location {
    homepage("native-aptoide:homepage"),
    appview("native-aptoide:appview"),
    middleappview("native-aptoide:middleappview"),
    search("native-aptoide:search"),
    secondinstall("native-aptoide:secondinstall"),
    secondtry("native-aptoide:secondtry"),
    aptoidesdk("sdk-aptoide:generic"),
    firstinstall("native-aptoide:first-install");

    private final String value;

    Location(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
