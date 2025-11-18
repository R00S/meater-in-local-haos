package oc;

import Cc.C0982e;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oc.v;

/* compiled from: FormBody.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0002\u0012\u0010B%\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, d2 = {"Loc/s;", "Loc/C;", "", "", "encodedNames", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "LCc/f;", "sink", "", "countBytes", "", "i", "(LCc/f;Z)J", "Loc/x;", "b", "()Loc/x;", "a", "()J", "Loa/F;", "h", "(LCc/f;)V", "Ljava/util/List;", "c", "d", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s extends AbstractC4179C {

    /* renamed from: e, reason: collision with root package name */
    private static final x f47075e = x.INSTANCE.a("application/x-www-form-urlencoded");

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> encodedNames;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<String> encodedValues;

    /* compiled from: FormBody.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0014"}, d2 = {"Loc/s$a;", "", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", "", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Loc/s$a;", "b", "Loc/s;", "c", "()Loc/s;", "Ljava/nio/charset/Charset;", "", "Ljava/util/List;", "names", "values", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Charset charset;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<String> names;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<String> values;

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(String name, String value) {
            C3862t.g(name, "name");
            C3862t.g(value, "value");
            List<String> list = this.names;
            v.Companion companion = v.INSTANCE;
            list.add(v.Companion.b(companion, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.charset, 91, null));
            this.values.add(v.Companion.b(companion, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.charset, 91, null));
            return this;
        }

        public final a b(String name, String value) {
            C3862t.g(name, "name");
            C3862t.g(value, "value");
            List<String> list = this.names;
            v.Companion companion = v.INSTANCE;
            list.add(v.Companion.b(companion, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.charset, 83, null));
            this.values.add(v.Companion.b(companion, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final s c() {
            return new s(this.names, this.values);
        }

        public a(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i10, C3854k c3854k) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    public s(List<String> encodedNames, List<String> encodedValues) {
        C3862t.g(encodedNames, "encodedNames");
        C3862t.g(encodedValues, "encodedValues");
        this.encodedNames = pc.d.T(encodedNames);
        this.encodedValues = pc.d.T(encodedValues);
    }

    private final long i(Cc.f sink, boolean countBytes) throws EOFException {
        C0982e bufferField;
        if (countBytes) {
            bufferField = new C0982e();
        } else {
            C3862t.d(sink);
            bufferField = sink.getBufferField();
        }
        int size = this.encodedNames.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                bufferField.d0(38);
            }
            bufferField.A0(this.encodedNames.get(i10));
            bufferField.d0(61);
            bufferField.A0(this.encodedValues.get(i10));
        }
        if (!countBytes) {
            return 0L;
        }
        long size2 = bufferField.getSize();
        bufferField.b();
        return size2;
    }

    @Override // oc.AbstractC4179C
    public long a() {
        return i(null, true);
    }

    @Override // oc.AbstractC4179C
    /* renamed from: b */
    public x getContentType() {
        return f47075e;
    }

    @Override // oc.AbstractC4179C
    public void h(Cc.f sink) throws EOFException {
        C3862t.g(sink, "sink");
        i(sink, false);
    }
}
