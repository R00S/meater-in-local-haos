package com.flurry.sdk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* renamed from: com.flurry.sdk.x6 */
/* loaded from: classes2.dex */
public final class C6201x6 {
    /* renamed from: a */
    public static boolean m13371a(C6193w6 c6193w6) {
        return new File(c6193w6.f16502a, c6193w6.f16503b).delete();
    }

    /* renamed from: b */
    public static boolean m13372b(C6193w6 c6193w6, C6193w6 c6193w62) throws Throwable {
        FileChannel fileChannel;
        FileChannel channel = null;
        try {
            File file = new File(c6193w6.f16502a, c6193w6.f16503b);
            File file2 = new File(c6193w62.f16502a, c6193w62.f16503b);
            file2.getParentFile().mkdirs();
            file2.delete();
            FileChannel channel2 = new FileInputStream(file).getChannel();
            try {
                channel = new FileOutputStream(file2).getChannel();
                channel.transferFrom(channel2, 0L, channel2.size());
                C6013c2.m12990f(channel2);
                C6013c2.m12990f(channel);
                return true;
            } catch (Exception e2) {
                e = e2;
                FileChannel fileChannel2 = channel;
                channel = channel2;
                fileChannel = fileChannel2;
                try {
                    C6021d1.m13030c(6, "FileProcessor", "Copy file failed. " + e.getMessage());
                    C6013c2.m12990f(channel);
                    C6013c2.m12990f(fileChannel);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    C6013c2.m12990f(channel);
                    C6013c2.m12990f(fileChannel);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                FileChannel fileChannel3 = channel;
                channel = channel2;
                fileChannel = fileChannel3;
                C6013c2.m12990f(channel);
                C6013c2.m12990f(fileChannel);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileChannel = null;
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
        }
    }

    /* renamed from: c */
    public static boolean m13373c(File file, File file2) throws Throwable {
        FileChannel fileChannel;
        FileChannel channel = null;
        try {
            file2.getParentFile().mkdirs();
            file2.delete();
            file2.createNewFile();
            FileChannel channel2 = new FileInputStream(file).getChannel();
            try {
                channel = new FileOutputStream(file2).getChannel();
                channel.transferFrom(channel2, 0L, channel2.size());
                C6013c2.m12990f(channel2);
                C6013c2.m12990f(channel);
                return true;
            } catch (Exception e2) {
                e = e2;
                FileChannel fileChannel2 = channel;
                channel = channel2;
                fileChannel = fileChannel2;
                try {
                    C6021d1.m13030c(6, "FileProcessor", "Copy file failed. " + e.getMessage());
                    C6013c2.m12990f(channel);
                    C6013c2.m12990f(fileChannel);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    C6013c2.m12990f(channel);
                    C6013c2.m12990f(fileChannel);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                FileChannel fileChannel3 = channel;
                channel = channel2;
                fileChannel = fileChannel3;
                C6013c2.m12990f(channel);
                C6013c2.m12990f(fileChannel);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileChannel = null;
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
        }
    }

    /* renamed from: d */
    public static boolean m13374d(C6193w6 c6193w6, C6193w6 c6193w62) throws Throwable {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        File file;
        FileChannel channel;
        FileChannel channel2 = null;
        try {
            file = new File(c6193w6.f16502a, c6193w6.f16503b);
            channel = new FileInputStream(new File(c6193w62.f16502a, c6193w62.f16503b)).getChannel();
        } catch (Exception unused) {
            fileChannel2 = null;
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            channel2 = new FileOutputStream(file, true).getChannel();
            channel2.transferFrom(channel, channel2.size(), channel.size());
            C6013c2.m12990f(channel);
            C6013c2.m12990f(channel2);
            return true;
        } catch (Exception unused2) {
            FileChannel fileChannel3 = channel2;
            channel2 = channel;
            fileChannel2 = fileChannel3;
            C6013c2.m12990f(channel2);
            C6013c2.m12990f(fileChannel2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            FileChannel fileChannel4 = channel2;
            channel2 = channel;
            fileChannel = fileChannel4;
            C6013c2.m12990f(channel2);
            C6013c2.m12990f(fileChannel);
            throw th;
        }
    }
}
