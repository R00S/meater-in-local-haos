package F4;

import P5.z;
import Vc.a;
import android.content.Intent;
import c5.C2316d;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.cloud.responses.SyncApiResponse;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.NetworkConstant;
import com.apptionlabs.meater_app.data.NoteHelper;
import com.apptionlabs.meater_app.data.SaveCookHelper;
import com.apptionlabs.meater_app.model.CookNote;
import com.google.gson.l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import nd.s;
import oa.C4165j;
import oa.InterfaceC4164i;
import oc.E;

/* compiled from: MEATERCloudNoteSyncing.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u0004¨\u0006!²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002"}, d2 = {"LF4/f;", "LF4/g;", "LVc/a;", "<init>", "()V", "", "Lcom/google/gson/l;", "notes", "Loa/F;", "A", "(Ljava/util/List;)V", "Lcom/apptionlabs/meater_app/model/CookNote;", "note", "B", "(Lcom/apptionlabs/meater_app/model/CookNote;)V", "C", "", "url", "hash", "s", "(Ljava/lang/String;Ljava/lang/String;)V", "r", "w", "cookNote", "z", "o", "e", "()Ljava/lang/String;", "p", "c", "d", "Lcom/apptionlabs/meater_app/data/NetworkConstant;", "networkConstant", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f extends g implements Vc.a {

    /* renamed from: f, reason: collision with root package name */
    public static final f f4544f = new f();

    /* compiled from: MEATERCloudNoteSyncing.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"F4/f$a", "Lnd/d;", "Loc/E;", "Lnd/b;", "call", "", "t", "Loa/F;", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "Lnd/s;", "response", "onResponse", "(Lnd/b;Lnd/s;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements nd.d<E> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CookNote f4545a;

        a(CookNote cookNote) {
            this.f4545a = cookNote;
        }

        @Override // nd.d
        public void onFailure(nd.b<E> call, Throwable t10) {
            C3862t.g(call, "call");
            C3862t.g(t10, "t");
            f.f4544f.o();
        }

        @Override // nd.d
        public void onResponse(nd.b<E> call, s<E> response) {
            C3862t.g(call, "call");
            C3862t.g(response, "response");
            if (response.f()) {
                LocalStorage.sharedStorage().cookNoteDAO().h(this.f4545a);
                f.f4544f.o();
            } else {
                onFailure(call, new Exception());
                f.f4544f.g(response);
            }
        }
    }

    /* compiled from: MEATERCloudNoteSyncing.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J+\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"F4/f$b", "Lnd/d;", "Lcom/apptionlabs/meater_app/cloud/responses/SyncApiResponse;", "Lnd/b;", "call", "Lnd/s;", "response", "Loa/F;", "onResponse", "(Lnd/b;Lnd/s;)V", "", "t", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements nd.d<SyncApiResponse> {
        b() {
        }

        @Override // nd.d
        public void onFailure(nd.b<SyncApiResponse> call, Throwable t10) {
            C3862t.g(call, "call");
            C3862t.g(t10, "t");
            f.f4544f.q();
        }

        @Override // nd.d
        public void onResponse(nd.b<SyncApiResponse> call, s<SyncApiResponse> response) {
            C3862t.g(call, "call");
            C3862t.g(response, "response");
            if (!response.f()) {
                onFailure(call, new Exception());
                return;
            }
            SyncApiResponse syncApiResponseA = response.a();
            if (syncApiResponseA == null) {
                return;
            }
            List<l> data = syncApiResponseA.getData();
            f fVar = f.f4544f;
            fVar.A(data);
            if (syncApiResponseA.getHasMore()) {
                fVar.f(null, null);
            } else {
                fVar.p();
            }
        }
    }

    /* compiled from: MEATERCloudNoteSyncing.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J+\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"F4/f$c", "Lnd/d;", "Lcom/apptionlabs/meater_app/cloud/responses/SyncApiResponse;", "Lnd/b;", "call", "Lnd/s;", "response", "Loa/F;", "onResponse", "(Lnd/b;Lnd/s;)V", "", "t", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements nd.d<SyncApiResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4546a;

        c(String str) {
            this.f4546a = str;
        }

        @Override // nd.d
        public void onFailure(nd.b<SyncApiResponse> call, Throwable t10) {
            C3862t.g(call, "call");
            C3862t.g(t10, "t");
            f.f4544f.q();
        }

        @Override // nd.d
        public void onResponse(nd.b<SyncApiResponse> call, s<SyncApiResponse> response) {
            List<l> data;
            C3862t.g(call, "call");
            C3862t.g(response, "response");
            if (!response.f()) {
                onFailure(call, new Exception());
                return;
            }
            SyncApiResponse syncApiResponseA = response.a();
            if (syncApiResponseA == null || (data = syncApiResponseA.getData()) == null) {
                return;
            }
            f fVar = f.f4544f;
            fVar.A(data);
            fVar.p();
            fVar.getPrefs().C0(this.f4546a);
        }
    }

    /* compiled from: KoinComponent.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d implements Ba.a<NetworkConstant> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Vc.a f4547B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f4548C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f4549D;

        public d(Vc.a aVar, dd.a aVar2, Ba.a aVar3) {
            this.f4547B = aVar;
            this.f4548C = aVar2;
            this.f4549D = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.apptionlabs.meater_app.data.NetworkConstant, java.lang.Object] */
        @Override // Ba.a
        public final NetworkConstant invoke() {
            Vc.a aVar = this.f4547B;
            return (aVar instanceof Vc.b ? ((Vc.b) aVar).a() : aVar.b().getScopeRegistry().getRootScope()).c(P.b(NetworkConstant.class), this.f4548C, this.f4549D);
        }
    }

    /* compiled from: MEATERCloudNoteSyncing.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"F4/f$e", "Lnd/d;", "Loc/E;", "Lnd/b;", "call", "Lnd/s;", "response", "Loa/F;", "onResponse", "(Lnd/b;Lnd/s;)V", "", "t", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements nd.d<E> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CookNote f4550a;

        e(CookNote cookNote) {
            this.f4550a = cookNote;
        }

        @Override // nd.d
        public void onFailure(nd.b<E> call, Throwable t10) {
            C3862t.g(call, "call");
            C3862t.g(t10, "t");
            f.f4544f.h(true);
        }

        @Override // nd.d
        public void onResponse(nd.b<E> call, s<E> response) {
            C3862t.g(call, "call");
            C3862t.g(response, "response");
            if (!response.f()) {
                onFailure(call, new Exception());
                return;
            }
            CookNote cookNote = this.f4550a;
            cookNote.needsUploading = false;
            f fVar = f.f4544f;
            fVar.C(cookNote);
            U4.b.v(e.class.getSimpleName() + ": uploadIfNeeded - Note uploaded " + this.f4550a.noteID, new Object[0]);
            fVar.w();
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(List<l> notes) {
        U4.b.v(f.class.getSimpleName() + ": processNotes " + notes.size(), new Object[0]);
        Iterator<T> it = notes.iterator();
        while (it.hasNext()) {
            f4544f.B(NoteHelper.INSTANCE.getNoteFromJson((l) it.next()));
        }
        l lVar = (l) r.w0(notes);
        if (lVar != null) {
            f4544f.getPrefs().z0(lVar.D("updatedAt").v());
        }
    }

    private final void B(CookNote note) {
        U4.b.v(f.class.getSimpleName() + ": processWitNote - id = " + note.noteID + ", cookId = " + note.noteCookId + ", timestamp = " + note.timestamp + ", type = " + note.type, new Object[0]);
        CookNote cookNoteK = LocalStorage.sharedStorage().cookNoteDAO().k(note.noteID);
        note.needsUploading = false;
        if (note.needsDeleting) {
            U4.b.v(f.class.getSimpleName() + ": processWitNote - Delete note id " + note.noteID, new Object[0]);
            LocalStorage.sharedStorage().cookNoteDAO().h(note);
            return;
        }
        if (cookNoteK != null) {
            long j10 = cookNoteK.updatedAt;
            if (j10 > 0 && SaveCookHelper.INSTANCE.isOlderCook(j10, note.updatedAt)) {
                U4.b.v(f.class.getSimpleName() + ": processWitNote - Needs uploading note id " + note.noteID, new Object[0]);
                cookNoteK.needsUploading = true;
                C(cookNoteK);
                return;
            }
        }
        U4.b.v(f.class.getSimpleName() + ": processWitNote - Save to DB note id " + note.noteID, new Object[0]);
        C(note);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(CookNote note) {
        LocalStorage.sharedStorage().cookNoteDAO().g(note);
    }

    private static final NetworkConstant D(InterfaceC4164i<? extends NetworkConstant> interfaceC4164i) {
        return interfaceC4164i.getValue();
    }

    @Override // Vc.a
    public Uc.a b() {
        return a.C0268a.a(this);
    }

    @Override // F4.g
    public void c() {
        getPrefs().f0();
    }

    @Override // F4.g
    public void d() {
        getPrefs().d0();
    }

    @Override // F4.g
    public String e() {
        String strQ = getPrefs().q();
        C3862t.f(strQ, "getCurrentNoteSyncHash(...)");
        return strQ;
    }

    @Override // F4.g
    public void o() {
        U4.b.v(f.class.getSimpleName() + ": notifySyncCookRequestCompleted", new Object[0]);
        Intent intent = new Intent(MEATERIntent.INTENT_REFRESH_COOK_NOTES);
        intent.putExtra(MEATERIntent.EXTRA_COOK_ID, 0);
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    @Override // F4.g
    public void p() {
        super.p();
        List<CookNote> listC = LocalStorage.sharedStorage().cookNoteDAO().c();
        List<CookNote> list = listC;
        x4.b.c("cook_note_count", String.valueOf((list == null || list.isEmpty()) ? 0 : listC.size()));
    }

    @Override // F4.g
    public void r() {
        String str;
        nd.b<SyncApiResponse> bVarN;
        String strN = getPrefs().n();
        if (strN == null || strN.length() == 0) {
            str = null;
        } else {
            str = getGreenwichTime() + getPrefs().n();
        }
        F5.a authorizedMeaterApi = getAuthorizedMeaterApi();
        if (authorizedMeaterApi == null || (bVarN = authorizedMeaterApi.n(str, "updatedAt ASC")) == null) {
            return;
        }
        bVarN.enqueue(new b());
    }

    @Override // F4.g
    public void s(String url, String hash) {
        nd.b<SyncApiResponse> bVarO;
        C3862t.g(url, "url");
        C3862t.g(hash, "hash");
        F5.a unauthorizedMeaterApi = getUnauthorizedMeaterApi();
        if (unauthorizedMeaterApi == null || (bVarO = unauthorizedMeaterApi.o(url)) == null) {
            return;
        }
        bVarO.enqueue(new c(hash));
    }

    @Override // F4.g
    public void w() {
        nd.b<E> bVarJ;
        U4.b.v(f.class.getSimpleName() + ": uploadIfNeeded", new Object[0]);
        List<CookNote> listJ = LocalStorage.sharedStorage().cookNoteDAO().j();
        CookNote cookNote = listJ != null ? (CookNote) r.l0(listJ) : null;
        if (cookNote == null) {
            U4.b.v(f.class.getSimpleName() + ": uploadIfNeeded - No notes to upload", new Object[0]);
            h(false);
            return;
        }
        String str = D(C4165j.b(kd.a.f43922a.b(), new d(this, null, null))).getCloudBaseUrl() + "v2/cook-notes/" + cookNote.noteIDString();
        F5.a authorizedMeaterApi = getAuthorizedMeaterApi();
        if (authorizedMeaterApi == null || (bVarJ = authorizedMeaterApi.j(str, cookNote)) == null) {
            return;
        }
        bVarJ.enqueue(new e(cookNote));
    }

    public final void z(CookNote cookNote) {
        nd.b<E> bVarE;
        C3862t.g(cookNote, "cookNote");
        if (!z.f14085a.b()) {
            C2316d.n(x4.g.h().getString(R.string.establish_internet_connection), x4.g.h().getString(R.string.establish_internet_connection));
            o();
            return;
        }
        F5.a authorizedMeaterApi = getAuthorizedMeaterApi();
        if (authorizedMeaterApi == null || (bVarE = authorizedMeaterApi.e(cookNote.noteIDString())) == null) {
            return;
        }
        bVarE.enqueue(new a(cookNote));
    }
}
