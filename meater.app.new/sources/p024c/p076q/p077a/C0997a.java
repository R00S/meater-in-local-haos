package p024c.p076q.p077a;

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
/* renamed from: c.q.a.a */
/* loaded from: classes.dex */
public final class C0997a {

    /* renamed from: a */
    private static final Object f6582a = new Object();

    /* renamed from: b */
    private static C0997a f6583b;

    /* renamed from: c */
    private final Context f6584c;

    /* renamed from: d */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f6585d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, ArrayList<c>> f6586e = new HashMap<>();

    /* renamed from: f */
    private final ArrayList<b> f6587f = new ArrayList<>();

    /* renamed from: g */
    private final Handler f6588g;

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: c.q.a.a$a */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C0997a.this.m6342a();
            }
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: c.q.a.a$b */
    private static final class b {

        /* renamed from: a */
        final Intent f6590a;

        /* renamed from: b */
        final ArrayList<c> f6591b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f6590a = intent;
            this.f6591b = arrayList;
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: c.q.a.a$c */
    private static final class c {

        /* renamed from: a */
        final IntentFilter f6592a;

        /* renamed from: b */
        final BroadcastReceiver f6593b;

        /* renamed from: c */
        boolean f6594c;

        /* renamed from: d */
        boolean f6595d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f6592a = intentFilter;
            this.f6593b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f6593b);
            sb.append(" filter=");
            sb.append(this.f6592a);
            if (this.f6595d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private C0997a(Context context) {
        this.f6584c = context;
        this.f6588g = new a(context.getMainLooper());
    }

    /* renamed from: b */
    public static C0997a m6341b(Context context) {
        C0997a c0997a;
        synchronized (f6582a) {
            if (f6583b == null) {
                f6583b = new C0997a(context.getApplicationContext());
            }
            c0997a = f6583b;
        }
        return c0997a;
    }

    /* renamed from: a */
    void m6342a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f6585d) {
                size = this.f6587f.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f6587f.toArray(bVarArr);
                this.f6587f.clear();
            }
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = bVarArr[i2];
                int size2 = bVar.f6591b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    c cVar = bVar.f6591b.get(i3);
                    if (!cVar.f6595d) {
                        cVar.f6593b.onReceive(this.f6584c, bVar.f6590a);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m6343c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f6585d) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f6585d.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f6585d.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                String action = intentFilter.getAction(i2);
                ArrayList<c> arrayList2 = this.f6586e.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f6586e.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* renamed from: d */
    public boolean m6344d(Intent intent) {
        int i2;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.f6585d) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f6584c.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f6586e.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i3 = 0;
                while (i3 < arrayList3.size()) {
                    c cVar = arrayList3.get(i3);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f6592a);
                    }
                    if (cVar.f6594c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i2 = i3;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i2 = i3;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        int iMatch = cVar.f6592a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f6594c = true;
                            i3 = i2 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            strResolveTypeIfNeeded = str2;
                        } else if (z) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i3 = i2 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i4 = 0; i4 < arrayList5.size(); i4++) {
                        ((c) arrayList5.get(i4)).f6594c = false;
                    }
                    this.f6587f.add(new b(intent, arrayList5));
                    if (!this.f6588g.hasMessages(1)) {
                        this.f6588g.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public void m6345e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f6585d) {
            ArrayList<c> arrayListRemove = this.f6585d.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                c cVar = arrayListRemove.get(size);
                cVar.f6595d = true;
                for (int i2 = 0; i2 < cVar.f6592a.countActions(); i2++) {
                    String action = cVar.f6592a.getAction(i2);
                    ArrayList<c> arrayList = this.f6586e.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f6593b == broadcastReceiver) {
                                cVar2.f6595d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f6586e.remove(action);
                        }
                    }
                }
            }
        }
    }
}
