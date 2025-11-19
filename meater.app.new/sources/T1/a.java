package T1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: LocalBroadcastManager.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f15759f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static a f15760g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f15761a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f15762b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f15763c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<b> f15764d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f15765e;

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: T1.a$a, reason: collision with other inner class name */
    class HandlerC0229a extends Handler {
        HandlerC0229a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f15767a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<c> f15768b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f15767a = intent;
            this.f15768b = arrayList;
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f15769a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f15770b;

        /* renamed from: c, reason: collision with root package name */
        boolean f15771c;

        /* renamed from: d, reason: collision with root package name */
        boolean f15772d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f15769a = intentFilter;
            this.f15770b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f15770b);
            sb2.append(" filter=");
            sb2.append(this.f15769a);
            if (this.f15772d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    private a(Context context) {
        this.f15761a = context;
        this.f15765e = new HandlerC0229a(context.getMainLooper());
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f15759f) {
            try {
                if (f15760g == null) {
                    f15760g = new a(context.getApplicationContext());
                }
                aVar = f15760g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f15762b) {
                try {
                    size = this.f15764d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f15764d.toArray(bVarArr);
                    this.f15764d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f15768b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = bVar.f15768b.get(i11);
                    if (!cVar.f15772d) {
                        cVar.f15770b.onReceive(this.f15761a, bVar.f15767a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f15762b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<c> arrayList = this.f15762b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f15762b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList<c> arrayList2 = this.f15763c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f15763c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(Intent intent) {
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.f15762b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f15761a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList3 = this.f15763c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i11 = 0;
                    while (i11 < arrayList3.size()) {
                        c cVar = arrayList3.get(i11);
                        if (z10) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f15769a);
                        }
                        if (cVar.f15771c) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            i10 = i11;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = strResolveTypeIfNeeded;
                            arrayList = arrayList4;
                        } else {
                            i10 = i11;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = strResolveTypeIfNeeded;
                            int iMatch = cVar.f15769a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z10) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(cVar);
                                cVar.f15771c = true;
                                i11 = i10 + 1;
                                action = str;
                                arrayList3 = arrayList2;
                                strResolveTypeIfNeeded = str2;
                            } else if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                            }
                        }
                        arrayList4 = arrayList;
                        i11 = i10 + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    if (arrayList5 != null) {
                        for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                            ((c) arrayList5.get(i12)).f15771c = false;
                        }
                        this.f15764d.add(new b(intent, arrayList5));
                        if (!this.f15765e.hasMessages(1)) {
                            this.f15765e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
