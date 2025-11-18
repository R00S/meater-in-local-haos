package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import com.liulishuo.filedownloader.message.MessageSnapshot;

/* loaded from: classes2.dex */
public abstract class LargeMessageSnapshot extends MessageSnapshot {

    public static class CompletedFlowDirectlySnapshot extends CompletedSnapshot implements InterfaceC8693a {
        CompletedFlowDirectlySnapshot(int i2, boolean z, long j2) {
            super(i2, z, j2);
        }
    }

    public static class PausedSnapshot extends PendingMessageSnapshot {
        PausedSnapshot(int i2, long j2, long j3) {
            super(i2, j2, j3);
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.PendingMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) -2;
        }
    }

    public static class PendingMessageSnapshot extends LargeMessageSnapshot {

        /* renamed from: h */
        private final long f32986h;

        /* renamed from: i */
        private final long f32987i;

        PendingMessageSnapshot(PendingMessageSnapshot pendingMessageSnapshot) {
            this(pendingMessageSnapshot.m27531e(), pendingMessageSnapshot.mo27527f(), pendingMessageSnapshot.mo27522g());
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: f */
        public long mo27527f() {
            return this.f32986h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: g */
        public long mo27522g() {
            return this.f32987i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) 1;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeLong(this.f32986h);
            parcel.writeLong(this.f32987i);
        }

        PendingMessageSnapshot(int i2, long j2, long j3) {
            super(i2);
            this.f32986h = j2;
            this.f32987i = j3;
        }

        PendingMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f32986h = parcel.readLong();
            this.f32987i = parcel.readLong();
        }
    }

    public static class WarnFlowDirectlySnapshot extends WarnMessageSnapshot implements InterfaceC8693a {
        WarnFlowDirectlySnapshot(int i2, long j2, long j3) {
            super(i2, j2, j3);
        }
    }

    public static class WarnMessageSnapshot extends PendingMessageSnapshot implements MessageSnapshot.InterfaceC8692b {
        WarnMessageSnapshot(int i2, long j2, long j3) {
            super(i2, j2, j3);
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot.InterfaceC8692b
        /* renamed from: a */
        public MessageSnapshot mo27530a() {
            return new PendingMessageSnapshot(this);
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.PendingMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) -4;
        }

        WarnMessageSnapshot(Parcel parcel) {
            super(parcel);
        }
    }

    LargeMessageSnapshot(int i2) {
        super(i2);
        this.f32991g = true;
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    /* renamed from: i */
    public int mo27520i() {
        if (mo27527f() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) mo27527f();
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    /* renamed from: j */
    public int mo27521j() {
        if (mo27522g() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) mo27522g();
    }

    public static class ProgressMessageSnapshot extends LargeMessageSnapshot {

        /* renamed from: h */
        private final long f32988h;

        ProgressMessageSnapshot(int i2, long j2) {
            super(i2);
            this.f32988h = j2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: f */
        public long mo27527f() {
            return this.f32988h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) 3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeLong(this.f32988h);
        }

        ProgressMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f32988h = parcel.readLong();
        }
    }

    public static class RetryMessageSnapshot extends ErrorMessageSnapshot {

        /* renamed from: j */
        private final int f32989j;

        RetryMessageSnapshot(int i2, long j2, Throwable th, int i3) {
            super(i2, j2, th);
            this.f32989j = i3;
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: h */
        public int mo27529h() {
            return this.f32989j;
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) 5;
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f32989j);
        }

        RetryMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f32989j = parcel.readInt();
        }
    }

    public static class CompletedSnapshot extends LargeMessageSnapshot {

        /* renamed from: h */
        private final boolean f32978h;

        /* renamed from: i */
        private final long f32979i;

        CompletedSnapshot(int i2, boolean z, long j2) {
            super(i2);
            this.f32978h = z;
            this.f32979i = j2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: g */
        public long mo27522g() {
            return this.f32979i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) -3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: o */
        public boolean mo27523o() {
            return this.f32978h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f32978h ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f32979i);
        }

        CompletedSnapshot(Parcel parcel) {
            super(parcel);
            this.f32978h = parcel.readByte() != 0;
            this.f32979i = parcel.readLong();
        }
    }

    public static class ErrorMessageSnapshot extends LargeMessageSnapshot {

        /* renamed from: h */
        private final long f32984h;

        /* renamed from: i */
        private final Throwable f32985i;

        ErrorMessageSnapshot(int i2, long j2, Throwable th) {
            super(i2);
            this.f32984h = j2;
            this.f32985i = th;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: f */
        public long mo27527f() {
            return this.f32984h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) -1;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: l */
        public Throwable mo27528l() {
            return this.f32985i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeLong(this.f32984h);
            parcel.writeSerializable(this.f32985i);
        }

        ErrorMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f32984h = parcel.readLong();
            this.f32985i = (Throwable) parcel.readSerializable();
        }
    }

    LargeMessageSnapshot(Parcel parcel) {
        super(parcel);
    }

    public static class ConnectedMessageSnapshot extends LargeMessageSnapshot {

        /* renamed from: h */
        private final boolean f32980h;

        /* renamed from: i */
        private final long f32981i;

        /* renamed from: j */
        private final String f32982j;

        /* renamed from: k */
        private final String f32983k;

        ConnectedMessageSnapshot(int i2, boolean z, long j2, String str, String str2) {
            super(i2);
            this.f32980h = z;
            this.f32981i = j2;
            this.f32982j = str;
            this.f32983k = str2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: c */
        public String mo27524c() {
            return this.f32982j;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: d */
        public String mo27525d() {
            return this.f32983k;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: g */
        public long mo27522g() {
            return this.f32981i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) 2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: n */
        public boolean mo27526n() {
            return this.f32980h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f32980h ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f32981i);
            parcel.writeString(this.f32982j);
            parcel.writeString(this.f32983k);
        }

        ConnectedMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f32980h = parcel.readByte() != 0;
            this.f32981i = parcel.readLong();
            this.f32982j = parcel.readString();
            this.f32983k = parcel.readString();
        }
    }
}
