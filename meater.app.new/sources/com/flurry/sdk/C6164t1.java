package com.flurry.sdk;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.flurry.sdk.t1 */
/* loaded from: classes2.dex */
public final class C6164t1<ObjectType> extends C6156s1<ObjectType> {
    public C6164t1(InterfaceC6180v1<ObjectType> interfaceC6180v1) {
        super(interfaceC6180v1);
    }

    @Override // com.flurry.sdk.C6156s1, com.flurry.sdk.InterfaceC6180v1
    /* renamed from: a */
    public final void mo13095a(OutputStream outputStream, ObjectType objecttype) throws Throwable {
        if (outputStream == null) {
            return;
        }
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
            try {
                super.mo13095a(gZIPOutputStream2, objecttype);
                C6013c2.m12990f(gZIPOutputStream2);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                C6013c2.m12990f(gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.flurry.sdk.C6156s1, com.flurry.sdk.InterfaceC6180v1
    /* renamed from: b */
    public final ObjectType mo13096b(InputStream inputStream) throws Throwable {
        GZIPInputStream gZIPInputStream;
        GZIPInputStream gZIPInputStream2 = null;
        if (inputStream == null) {
            return null;
        }
        try {
            gZIPInputStream = new GZIPInputStream(inputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            ObjectType objecttype = (ObjectType) super.mo13096b(gZIPInputStream);
            C6013c2.m12990f(gZIPInputStream);
            return objecttype;
        } catch (Throwable th2) {
            th = th2;
            gZIPInputStream2 = gZIPInputStream;
            C6013c2.m12990f(gZIPInputStream2);
            throw th;
        }
    }
}
