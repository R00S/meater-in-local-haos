package p024c.p064l.p065b;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: PreferencesMapCompat.kt */
/* renamed from: c.l.b.d */
/* loaded from: classes.dex */
public final class C0971d {

    /* renamed from: a */
    public static final a f6469a = new a(null);

    /* compiled from: PreferencesMapCompat.kt */
    /* renamed from: c.l.b.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C0973f m6186a(InputStream inputStream) throws IOException {
            C9801m.m32346f(inputStream, "input");
            try {
                C0973f c0973fM6193Q = C0973f.m6193Q(inputStream);
                C9801m.m32345e(c0973fM6193Q, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return c0973fM6193Q;
            } catch (InvalidProtocolBufferException e2) {
                throw new CorruptionException("Unable to parse preferences proto.", e2);
            }
        }
    }
}
