package Q4;

import com.google.gson.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: JsonObject_Safe.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00162\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/google/gson/l;", "", "key", "Lcom/google/gson/j;", "c", "(Lcom/google/gson/l;Ljava/lang/String;)Lcom/google/gson/j;", "i", "(Lcom/google/gson/l;Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Lcom/google/gson/l;Ljava/lang/String;)Ljava/lang/Boolean;", "g", "(Lcom/google/gson/l;Ljava/lang/String;)Lcom/google/gson/l;", "Lcom/google/gson/g;", "f", "(Lcom/google/gson/l;Ljava/lang/String;)Lcom/google/gson/g;", "Lcom/google/gson/n;", "h", "(Lcom/google/gson/l;Ljava/lang/String;)Lcom/google/gson/n;", "", "e", "(Lcom/google/gson/l;Ljava/lang/String;)Ljava/lang/Integer;", "T", "Lkotlin/Function0;", "converter", "j", "(LBa/a;)Ljava/lang/Object;", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j {
    public static final Boolean b(com.google.gson.l lVar, String key) {
        C3862t.g(lVar, "<this>");
        C3862t.g(key, "key");
        com.google.gson.j jVarC = c(lVar, key);
        if (jVarC != null) {
            return h.o(jVarC);
        }
        return null;
    }

    public static final com.google.gson.j c(final com.google.gson.l lVar, final String key) {
        C3862t.g(lVar, "<this>");
        C3862t.g(key, "key");
        return (com.google.gson.j) j(new Ba.a() { // from class: Q4.i
            @Override // Ba.a
            public final Object invoke() {
                return j.d(lVar, key);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.gson.j d(com.google.gson.l lVar, String str) {
        return lVar.D(str);
    }

    public static final Integer e(com.google.gson.l lVar, String key) {
        C3862t.g(lVar, "<this>");
        C3862t.g(key, "key");
        com.google.gson.j jVarC = c(lVar, key);
        if (jVarC != null) {
            return h.q(jVarC);
        }
        return null;
    }

    public static final com.google.gson.g f(com.google.gson.l lVar, String key) {
        C3862t.g(lVar, "<this>");
        C3862t.g(key, "key");
        com.google.gson.j jVarC = c(lVar, key);
        if (jVarC != null) {
            return h.r(jVarC);
        }
        return null;
    }

    public static final com.google.gson.l g(com.google.gson.l lVar, String key) {
        C3862t.g(lVar, "<this>");
        C3862t.g(key, "key");
        com.google.gson.j jVarC = c(lVar, key);
        if (jVarC != null) {
            return h.s(jVarC);
        }
        return null;
    }

    public static final n h(com.google.gson.l lVar, String key) {
        C3862t.g(lVar, "<this>");
        C3862t.g(key, "key");
        com.google.gson.j jVarC = c(lVar, key);
        if (jVarC != null) {
            return h.t(jVarC);
        }
        return null;
    }

    public static final String i(com.google.gson.l lVar, String key) {
        C3862t.g(lVar, "<this>");
        C3862t.g(key, "key");
        com.google.gson.j jVarC = c(lVar, key);
        if (jVarC != null) {
            return h.u(jVarC);
        }
        return null;
    }

    private static final <T> T j(Ba.a<? extends T> aVar) {
        try {
            return aVar.invoke();
        } catch (Exception unused) {
            return null;
        }
    }
}
