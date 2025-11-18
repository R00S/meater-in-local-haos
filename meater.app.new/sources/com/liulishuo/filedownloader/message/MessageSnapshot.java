package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import android.os.Parcelable;
import p241e.p307h.p308a.p315k0.C9036f;

/* loaded from: classes2.dex */
public abstract class MessageSnapshot implements Parcelable {
    public static final Parcelable.Creator<MessageSnapshot> CREATOR = new C8691a();

    /* renamed from: f */
    private final int f32990f;

    /* renamed from: g */
    protected boolean f32991g;

    public static class NoFieldException extends IllegalStateException {
        NoFieldException(String str, MessageSnapshot messageSnapshot) {
            super(C9036f.m29009o("There isn't a field for '%s' in this message %d %d %s", str, Integer.valueOf(messageSnapshot.m27531e()), Byte.valueOf(messageSnapshot.mo27519k()), messageSnapshot.getClass().getName()));
        }
    }

    public static class StartedMessageSnapshot extends MessageSnapshot {
        StartedMessageSnapshot(int i2) {
            super(i2);
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) 6;
        }

        StartedMessageSnapshot(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: com.liulishuo.filedownloader.message.MessageSnapshot$a */
    static class C8691a implements Parcelable.Creator<MessageSnapshot> {
        C8691a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.liulishuo.filedownloader.message.MessageSnapshot createFromParcel(android.os.Parcel r5) {
            /*
                r4 = this;
                byte r0 = r5.readByte()
                r1 = 1
                if (r0 != r1) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                byte r2 = r5.readByte()
                r3 = -4
                if (r2 == r3) goto L84
                r3 = -3
                if (r2 == r3) goto L76
                r3 = -1
                if (r2 == r3) goto L68
                if (r2 == r1) goto L5a
                r1 = 2
                if (r2 == r1) goto L4c
                r1 = 3
                if (r2 == r1) goto L3e
                r1 = 5
                if (r2 == r1) goto L30
                r1 = 6
                if (r2 == r1) goto L28
                r5 = 0
                goto L92
            L28:
                com.liulishuo.filedownloader.message.MessageSnapshot$StartedMessageSnapshot r1 = new com.liulishuo.filedownloader.message.MessageSnapshot$StartedMessageSnapshot
                r1.<init>(r5)
            L2d:
                r5 = r1
                goto L92
            L30:
                if (r0 == 0) goto L38
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$RetryMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$RetryMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L38:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$RetryMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$RetryMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L3e:
                if (r0 == 0) goto L46
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$ProgressMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ProgressMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L46:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$ProgressMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ProgressMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L4c:
                if (r0 == 0) goto L54
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$ConnectedMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ConnectedMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L54:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$ConnectedMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ConnectedMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L5a:
                if (r0 == 0) goto L62
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$PendingMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$PendingMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L62:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$PendingMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$PendingMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L68:
                if (r0 == 0) goto L70
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$ErrorMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ErrorMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L70:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$ErrorMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ErrorMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L76:
                if (r0 == 0) goto L7e
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$CompletedSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$CompletedSnapshot
                r1.<init>(r5)
                goto L2d
            L7e:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$CompletedSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$CompletedSnapshot
                r1.<init>(r5)
                goto L2d
            L84:
                if (r0 == 0) goto L8c
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$WarnMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$WarnMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L8c:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$WarnMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$WarnMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L92:
                if (r5 == 0) goto L97
                r5.f32991g = r0
                return r5
            L97:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Can't restore the snapshot because unknown status: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                goto Laf
            Lae:
                throw r5
            Laf:
                goto Lae
            */
            throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.message.MessageSnapshot.C8691a.createFromParcel(android.os.Parcel):com.liulishuo.filedownloader.message.MessageSnapshot");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageSnapshot[] newArray(int i2) {
            return new MessageSnapshot[i2];
        }
    }

    /* renamed from: com.liulishuo.filedownloader.message.MessageSnapshot$b */
    public interface InterfaceC8692b {
        /* renamed from: a */
        MessageSnapshot mo27530a();
    }

    MessageSnapshot(int i2) {
        this.f32990f = i2;
    }

    /* renamed from: c */
    public String mo27524c() {
        throw new NoFieldException("getEtag", this);
    }

    /* renamed from: d */
    public String mo27525d() {
        throw new NoFieldException("getFileName", this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int m27531e() {
        return this.f32990f;
    }

    /* renamed from: f */
    public long mo27527f() {
        throw new NoFieldException("getLargeSofarBytes", this);
    }

    /* renamed from: g */
    public long mo27522g() {
        throw new NoFieldException("getLargeTotalBytes", this);
    }

    /* renamed from: h */
    public int mo27529h() {
        throw new NoFieldException("getRetryingTimes", this);
    }

    /* renamed from: i */
    public int mo27520i() {
        throw new NoFieldException("getSmallSofarBytes", this);
    }

    /* renamed from: j */
    public int mo27521j() {
        throw new NoFieldException("getSmallTotalBytes", this);
    }

    /* renamed from: k */
    public abstract /* synthetic */ byte mo27519k();

    /* renamed from: l */
    public Throwable mo27528l() {
        throw new NoFieldException("getThrowable", this);
    }

    /* renamed from: m */
    public boolean m27532m() {
        return this.f32991g;
    }

    /* renamed from: n */
    public boolean mo27526n() {
        throw new NoFieldException("isResuming", this);
    }

    /* renamed from: o */
    public boolean mo27523o() {
        throw new NoFieldException("isReusedDownloadedFile", this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f32991g ? (byte) 1 : (byte) 0);
        parcel.writeByte(mo27519k());
        parcel.writeInt(this.f32990f);
    }

    MessageSnapshot(Parcel parcel) {
        this.f32990f = parcel.readInt();
    }
}
