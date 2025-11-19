package P5;

import android.content.Context;
import com.apptionlabs.meater_app.data.DateExtensionKt;
import com.apptionlabs.meater_app.data.Help;
import com.apptionlabs.meater_app.data.JuicyCookListData;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import o4.Recipe;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JSONUtilities.java */
/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static ArrayList<Help> f14062a;

    /* renamed from: b, reason: collision with root package name */
    private static String f14063b;

    private static ArrayList<Help> a() throws JSONException {
        MEATERDeviceType typeFromProbeNumber;
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(f14063b).optJSONArray("Sections");
            f14062a = new ArrayList<>();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObject = (JSONObject) jSONArrayOptJSONArray.get(i10);
                String string = jSONObject.getString("Name");
                Help help = new Help();
                if (string.isEmpty()) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("Videos");
                    Help help2 = new Help();
                    help2.setHelpType(1);
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                        JSONObject jSONObject2 = (JSONObject) jSONArrayOptJSONArray2.get(i11);
                        String string2 = jSONObject2.getString("Title");
                        String string3 = jSONObject2.getString("Page");
                        String string4 = jSONObject2.getString("Thumbnail");
                        String string5 = jSONObject2.getString("YouTubeID");
                        help2.setIsHeader(false);
                        if (i11 == 0) {
                            help2.setTitle(string2);
                            help2.setThumbnail(string4);
                            help2.setContent(string3);
                            help2.setYouTubeID(string5);
                        } else {
                            help2.setTitle2(string2);
                            help2.setThumbnail2(string4);
                            help2.setContent2(string3);
                            help2.setYouTubeID2(string5);
                        }
                    }
                    f14062a.add(help2);
                } else {
                    help.setTitle(string);
                    help.setIsHeader(true);
                    help.setHelpType(0);
                    f14062a.add(help);
                    JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("Pages");
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                        JSONObject jSONObject3 = (JSONObject) jSONArrayOptJSONArray3.get(i12);
                        String string6 = jSONObject3.getString("Title");
                        Help help3 = new Help();
                        help3.setTitle(string6);
                        help3.setHelpType(2);
                        help3.setIsHeader(false);
                        String string7 = jSONObject3.has("Page") ? jSONObject3.getString("Page") : null;
                        if (string7 != null) {
                            help3.setContent(string7);
                        }
                        if (string.equalsIgnoreCase("APPTION LABS ON SOCIAL MEDIA")) {
                            help3.setUrlIcon(jSONObject3.getString("Icon"));
                        }
                        if (string7 == null || !string7.startsWith("safety") || ((typeFromProbeNumber = MEATERDeviceType.getTypeFromProbeNumber(jSONObject3.getInt("DeviceType"))) != null && !FirmwareVersion.sharedInstance().mustUpdateAppBeforeConnectingToQSGDeviceType(typeFromProbeNumber))) {
                            f14062a.add(help3);
                        }
                    }
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return f14062a;
    }

    public static int b() throws IOException {
        try {
            InputStream inputStreamOpen = x4.g.h().getAssets().open("safety_info.json");
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            return new JSONObject(new String(bArr, StandardCharsets.UTF_8)).getInt("version_latest");
        } catch (IOException | JSONException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static JuicyCookListData c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return (JuicyCookListData) new Gson().k(jSONObject.toString(), JuicyCookListData.class);
    }

    public static ArrayList<Help> d(Context context, String str) throws IOException {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            f14063b = new String(bArr, StandardCharsets.UTF_8);
            return a();
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static int e(ArrayList<Recipe> arrayList, long j10) throws ParseException {
        int i10 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (j10 == -1) {
                return arrayList.size();
            }
            try {
                Iterator<Recipe> it = arrayList.iterator();
                while (it.hasNext()) {
                    String firstPublishedAt = it.next().getFirstPublishedAt();
                    if (firstPublishedAt != null) {
                        Date date = DateExtensionKt.getDateFormatWithTimeZoneForRecipe().parse(firstPublishedAt.replaceAll("Z$", "+0000"));
                        if (date == null) {
                            return i10;
                        }
                        if (date.getTime() > j10) {
                            i10++;
                        }
                    }
                }
                return i10;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return i10;
    }
}
