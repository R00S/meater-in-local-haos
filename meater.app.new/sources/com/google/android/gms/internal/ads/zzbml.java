package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbml implements zzalm<zzbmp> {

    /* renamed from: a */
    private final Context f23236a;

    /* renamed from: b */
    private final zzty f23237b;

    /* renamed from: c */
    private final PowerManager f23238c;

    public zzbml(Context context, zzty zztyVar) {
        this.f23236a = context;
        this.f23237b = zztyVar;
        this.f23238c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject mo15021b(zzbmp zzbmpVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzud zzudVar = zzbmpVar.f23256f;
        if (zzudVar == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.f23237b.m20590c() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzudVar.f27134c;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f23237b.m20589b()).put("activeViewJSON", this.f23237b.m20590c()).put("timestamp", zzbmpVar.f23254d).put("adFormat", this.f23237b.m20588a()).put("hashCode", this.f23237b.m20591d()).put("isMraid", false).put("isStopped", false).put("isPaused", zzbmpVar.f23252b).put("isNative", this.f23237b.m20592e()).put("isScreenOn", Build.VERSION.SDK_INT >= 20 ? this.f23238c.isInteractive() : this.f23238c.isScreenOn()).put("appMuted", zzk.zzll().m17217e()).put("appVolume", zzk.zzll().m17216d()).put("deviceVolume", zzaya.m17212c(this.f23236a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f23236a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzudVar.f27135d).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzudVar.f27136e.top).put("bottom", zzudVar.f27136e.bottom).put("left", zzudVar.f27136e.left).put("right", zzudVar.f27136e.right)).put("adBox", new JSONObject().put("top", zzudVar.f27137f.top).put("bottom", zzudVar.f27137f.bottom).put("left", zzudVar.f27137f.left).put("right", zzudVar.f27137f.right)).put("globalVisibleBox", new JSONObject().put("top", zzudVar.f27138g.top).put("bottom", zzudVar.f27138g.bottom).put("left", zzudVar.f27138g.left).put("right", zzudVar.f27138g.right)).put("globalVisibleBoxVisible", zzudVar.f27139h).put("localVisibleBox", new JSONObject().put("top", zzudVar.f27140i.top).put("bottom", zzudVar.f27140i.bottom).put("left", zzudVar.f27140i.left).put("right", zzudVar.f27140i.right)).put("localVisibleBoxVisible", zzudVar.f27141j).put("hitBox", new JSONObject().put("top", zzudVar.f27142k.top).put("bottom", zzudVar.f27142k.bottom).put("left", zzudVar.f27142k.left).put("right", zzudVar.f27142k.right)).put("screenDensity", this.f23236a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzbmpVar.f23251a);
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21702S1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzudVar.f27145n;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzbmpVar.f23255e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
