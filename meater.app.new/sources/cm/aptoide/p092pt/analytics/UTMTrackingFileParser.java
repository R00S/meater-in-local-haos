package cm.aptoide.p092pt.analytics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public class UTMTrackingFileParser {
    private BufferedReader bufferedReader;
    private String utm_line;

    public UTMTrackingFileParser(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        this.bufferedReader = bufferedReader;
        try {
            this.utm_line = bufferedReader.readLine();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public String valueExtracter(String str) {
        for (String str2 : this.utm_line.split("&")) {
            if (str2.contains(str)) {
                return str2.substring(str.length() + 1);
            }
        }
        return "unknown";
    }
}
