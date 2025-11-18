package com.flurry.sdk;

import android.os.Build;
import android.text.TextUtils;
import com.flurry.sdk.C6009b7;
import com.flurry.sdk.C6065i;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.flurry.sdk.j */
/* loaded from: classes2.dex */
public final class C6074j {

    /* renamed from: a */
    private C6083k f16001a = null;

    /* renamed from: b */
    byte[] f16002b = null;

    /* renamed from: d */
    private C6018c7<C6065i> f16004d = null;

    /* renamed from: c */
    private final C6009b7<byte[]> f16003c = new C6009b7<>(new C6148r1());

    /* renamed from: com.flurry.sdk.j$a */
    final class a implements InterfaceC6204y1<C6065i> {
        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6204y1
        /* renamed from: a */
        public final InterfaceC6180v1<C6065i> mo13122a(int i2) {
            return new C6065i.a();
        }
    }

    C6074j() {
    }

    /* renamed from: e */
    private static File m13116e() {
        return new File(C6004b2.m12970d().getPath() + File.separator + "installationNum");
    }

    /* renamed from: f */
    private static SecretKey m13117f() {
        C6084k0 c6084k0M13141a = C6084k0.m13141a();
        C6021d1.m13030c(3, "APIKeyProvider", "Getting legacy apikey: " + c6084k0M13141a.f16042c);
        String str = c6084k0M13141a.f16042c;
        if (str == null) {
            return null;
        }
        String strM12952a = C5995a2.m12952a(C6002b0.m12964a());
        try {
            return new SecretKeySpec(SecretKeyFactory.getInstance("PBEWithSHA256And256BitAES-CBC-BC").generateSecret(new PBEKeySpec(str.toCharArray(), ByteBuffer.allocate(8).putLong(TextUtils.isEmpty(strM12952a) ? Long.MIN_VALUE : C6013c2.m12994j(strM12952a)).array(), 1000, 256)).getEncoded(), "AES");
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
            C6021d1.m13031d(4, "InstallationIdProvider", "Error in generate secret key", e2);
            return null;
        }
    }

    /* renamed from: a */
    public final void m13118a() {
        if (this.f16004d == null) {
            this.f16004d = new C6018c7<>(m13116e(), "installationNum", 1, new a());
            byte[] bArrM13120c = m13120c(m13121d());
            if (bArrM13120c == null || Build.VERSION.SDK_INT < 23) {
                return;
            }
            C6004b2.m12971e(m13116e());
            m13119b(bArrM13120c, C6009b7.a.CRYPTO_ALGO_PADDING_7);
        }
    }

    /* renamed from: b */
    final boolean m13119b(byte[] bArr, C6009b7.a aVar) {
        try {
            C6004b2.m12971e(m13116e());
            byte[] bArr2 = new byte[16];
            new SecureRandom().nextBytes(bArr2);
            byte[] bArrM12977b = this.f16003c.m12977b(bArr, m13121d(), new IvParameterSpec(bArr2), aVar);
            this.f16004d.m13012b(bArrM12977b != null ? new C6065i(bArrM12977b, bArr2, true, aVar.ordinal()) : new C6065i(bArr, new byte[0], false, aVar.ordinal()));
            return true;
        } catch (IOException e2) {
            C6021d1.m13031d(5, "InstallationIdProvider", "Error while generating UUID" + e2.getMessage(), e2);
            return false;
        }
    }

    /* renamed from: c */
    final byte[] m13120c(Key key) {
        byte[] bArrM12976a = null;
        try {
            C6065i c6065iM13011a = this.f16004d.m13011a();
            if (c6065iM13011a != null) {
                if (c6065iM13011a.f15962a) {
                    byte[] bArr = c6065iM13011a.f15963b;
                    byte[] bArr2 = c6065iM13011a.f15964c;
                    C6009b7.a aVarM12978g = C6009b7.a.m12978g(c6065iM13011a.f15965d);
                    if (bArr != null && bArr2 != null) {
                        bArrM12976a = this.f16003c.m12976a(bArr2, key, new IvParameterSpec(bArr), aVarM12978g);
                    }
                } else {
                    bArrM12976a = c6065iM13011a.f15964c;
                }
            }
        } catch (IOException unused) {
            C6021d1.m13030c(5, "InstallationIdProvider", "Error while reading Android Install Id. Deleting file.");
        }
        return bArrM12976a;
    }

    /* renamed from: d */
    final Key m13121d() {
        if (Build.VERSION.SDK_INT < 23) {
            return m13117f();
        }
        if (this.f16001a == null) {
            this.f16001a = new C6083k();
        }
        return this.f16001a.m13140a();
    }
}
