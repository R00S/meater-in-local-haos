package com.flurry.sdk;

import com.flurry.sdk.C6048g0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.n3 */
/* loaded from: classes2.dex */
public final class C6114n3 {

    /* renamed from: a */
    private static final List<EnumC6161s6> f16175a;

    static {
        ArrayList arrayList = new ArrayList();
        f16175a = arrayList;
        arrayList.add(EnumC6161s6.SESSION_ID);
        arrayList.add(EnumC6161s6.SESSION_INFO);
        arrayList.add(EnumC6161s6.REPORTED_ID);
    }

    /* renamed from: a */
    public static C6048g0.b m13206a(File file) {
        try {
            return m13207b(m13208c(file));
        } catch (IOException e2) {
            C6021d1.m13037j("FileWriterUtils", "Invalid frame data file: " + file + " => " + e2.toString());
            C6048g0.b bVar = C6048g0.b.IOEXCEPTION;
            bVar.f15901n = e2.toString();
            return bVar;
        }
    }

    /* renamed from: b */
    private static C6048g0.b m13207b(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        TreeSet treeSet = new TreeSet();
        C6048g0.b bVar = C6048g0.b.SUCCEED;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            try {
                if (bArr.length <= i2) {
                    break;
                }
                if (bArr.length - i2 <= 0) {
                    bVar = C6048g0.b.EOF;
                    bVar.f15901n = "EOF frame version";
                    break;
                }
                int i4 = i2 + 1;
                byte[] bArr2 = new byte[3];
                if (bArr.length - i4 < 3) {
                    bVar = C6048g0.b.EOF;
                    bVar.f15901n = "EOF frame type";
                    break;
                }
                bArr2[0] = bArr[i4];
                bArr2[1] = bArr[i4 + 1];
                bArr2[2] = bArr[i4 + 2];
                int i5 = i4 + 3;
                byte[] bArr3 = new byte[4];
                System.arraycopy(bArr2, 0, bArr3, 1, 3);
                int i6 = ByteBuffer.wrap(bArr3).getInt();
                arrayList.add(EnumC6161s6.m13306g(i6));
                for (EnumC6161s6 enumC6161s6 : f16175a) {
                    if (i6 == enumC6161s6.f16372T) {
                        treeSet.add(enumC6161s6);
                    }
                }
                if (bArr.length - i5 < 8) {
                    bVar = C6048g0.b.EOF;
                    bVar.f15901n = "EOF frame timestamp";
                    break;
                }
                int i7 = i5 + 8;
                if (bArr.length - i7 < 8) {
                    bVar = C6048g0.b.EOF;
                    bVar.f15901n = "EOF frame relative timestamp";
                    break;
                }
                int i8 = i7 + 8;
                byte[] bArr4 = new byte[4];
                if (bArr.length - i8 < 4) {
                    bVar = C6048g0.b.EOF;
                    bVar.f15901n = "EOF frame payload length";
                    break;
                }
                System.arraycopy(bArr, i8, bArr4, 0, 4);
                int i9 = i8 + 4;
                int i10 = ByteBuffer.wrap(bArr4).getInt();
                byte[] bArr5 = new byte[i10];
                if (bArr.length - i9 < i10) {
                    bVar = C6048g0.b.EOF;
                    bVar.f15901n = "EOF frame payload";
                    break;
                }
                System.arraycopy(bArr, i9, bArr5, 0, i10);
                int i11 = i9 + i10;
                try {
                    new JSONObject(new String(bArr5));
                    if (bArr.length - i11 < 4) {
                        bVar = C6048g0.b.EOF;
                        bVar.f15901n = "EOF frame checksum";
                        break;
                    }
                    i2 = i11 + 4;
                    i3++;
                } catch (JSONException e2) {
                    C6021d1.m13037j("FileWriterUtils", "Invalid Frame Payload: " + EnumC6161s6.m13306g(i6));
                    C6048g0.b bVar2 = C6048g0.b.PAYLOAD_ERROR;
                    bVar2.f15901n = e2.toString();
                    bVar = bVar2;
                }
            } catch (Exception | VirtualMachineError e3) {
                C6021d1.m13037j("FileWriterUtils", "Invalid Payload: " + e3.toString());
                C6048g0.b bVar3 = C6048g0.b.PAYLOAD_ERROR;
                bVar3.f15901n = e3.toString();
                bVar = bVar3;
            }
        }
        if (bVar == C6048g0.b.SUCCEED && treeSet.size() < f16175a.size()) {
            bVar = C6048g0.b.FRAME_MISSING;
        }
        bVar.f15902o = bArr.length;
        bVar.f15903p = i3;
        bVar.f15904q = arrayList;
        bVar.f15905r = treeSet;
        return bVar;
    }

    /* renamed from: c */
    private static byte[] m13208c(File file) throws IOException {
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int i2 = fileInputStream.read(bArr, 0, length);
            if (i2 < length) {
                int i3 = length - i2;
                while (i3 > 0) {
                    int i4 = fileInputStream.read(bArr2, 0, i3);
                    System.arraycopy(bArr2, 0, bArr, length - i3, i4);
                    i3 -= i4;
                }
            }
            return bArr;
        } finally {
            fileInputStream.close();
        }
    }
}
