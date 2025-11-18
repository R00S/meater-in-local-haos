package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import com.liulishuo.filedownloader.message.MessageSnapshot;

/* loaded from: classes2.dex */
public abstract class SmallMessageSnapshot extends MessageSnapshot {

    public static class CompletedFlowDirectlySnapshot extends CompletedSnapshot implements InterfaceC8693a {
        CompletedFlowDirectlySnapshot(int i2, boolean z, int i3) {
            super(i2, z, i3);
        }
    }

    public static class PausedSnapshot extends PendingMessageSnapshot {
        PausedSnapshot(int i2, int i3, int i4) {
            super(i2, i3, i4);
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.PendingMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) -2;
        }
    }

    public static class PendingMessageSnapshot extends SmallMessageSnapshot {

        /* renamed from: h */
        private final int f33000h;

        /* renamed from: i */
        private final int f33001i;

        PendingMessageSnapshot(PendingMessageSnapshot pendingMessageSnapshot) {
            this(pendingMessageSnapshot.m27531e(), pendingMessageSnapshot.mo27520i(), pendingMessageSnapshot.mo27521j());
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: i */
        public int mo27520i() {
            return this.f33000h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: j */
        public int mo27521j() {
            return this.f33001i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) 1;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f33000h);
            parcel.writeInt(this.f33001i);
        }

        PendingMessageSnapshot(int i2, int i3, int i4) {
            super(i2);
            this.f33000h = i3;
            this.f33001i = i4;
        }

        PendingMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f33000h = parcel.readInt();
            this.f33001i = parcel.readInt();
        }
    }

    public static class WarnFlowDirectlySnapshot extends WarnMessageSnapshot implements InterfaceC8693a {
        WarnFlowDirectlySnapshot(int i2, int i3, int i4) {
            super(i2, i3, i4);
        }
    }

    public static class WarnMessageSnapshot extends PendingMessageSnapshot implements MessageSnapshot.InterfaceC8692b {
        WarnMessageSnapshot(int i2, int i3, int i4) {
            super(i2, i3, i4);
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot.InterfaceC8692b
        /* renamed from: a */
        public MessageSnapshot mo27530a() {
            return new PendingMessageSnapshot(this);
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.PendingMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) -4;
        }

        WarnMessageSnapshot(Parcel parcel) {
            super(parcel);
        }
    }

    SmallMessageSnapshot(int i2) {
        super(i2);
        this.f32991g = false;
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    /* renamed from: f */
    public long mo27527f() {
        return mo27520i();
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    /* renamed from: g */
    public long mo27522g() {
        return mo27521j();
    }

    public static class ProgressMessageSnapshot extends SmallMessageSnapshot {

        /* renamed from: h */
        private final int f33002h;

        ProgressMessageSnapshot(int i2, int i3) {
            super(i2);
            this.f33002h = i3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: i */
        public int mo27520i() {
            return this.f33002h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) 3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f33002h);
        }

        ProgressMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f33002h = parcel.readInt();
        }
    }

    public static class RetryMessageSnapshot extends ErrorMessageSnapshot {

        /* renamed from: j */
        private final int f33003j;

        RetryMessageSnapshot(int i2, int i3, Throwable th, int i4) {
            super(i2, i3, th);
            this.f33003j = i4;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: h */
        public int mo27529h() {
            return this.f33003j;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) 5;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f33003j);
        }

        RetryMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f33003j = parcel.readInt();
        }
    }

    public static class CompletedSnapshot extends SmallMessageSnapshot {

        /* renamed from: h */
        private final boolean f32992h;

        /* renamed from: i */
        private final int f32993i;

        CompletedSnapshot(int i2, boolean z, int i3) {
            super(i2);
            this.f32992h = z;
            this.f32993i = i3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: j */
        public int mo27521j() {
            return this.f32993i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) -3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: o */
        public boolean mo27523o() {
            return this.f32992h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f32992h ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f32993i);
        }

        CompletedSnapshot(Parcel parcel) {
            super(parcel);
            this.f32992h = parcel.readByte() != 0;
            this.f32993i = parcel.readInt();
        }
    }

    public static class ErrorMessageSnapshot extends SmallMessageSnapshot {

        /* renamed from: h */
        private final int f32998h;

        /* renamed from: i */
        private final Throwable f32999i;

        ErrorMessageSnapshot(int i2, int i3, Throwable th) {
            super(i2);
            this.f32998h = i3;
            this.f32999i = th;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: i */
        public int mo27520i() {
            return this.f32998h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) -1;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: l */
        public Throwable mo27528l() {
            return this.f32999i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f32998h);
            parcel.writeSerializable(this.f32999i);
        }

        ErrorMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f32998h = parcel.readInt();
            this.f32999i = (Throwable) parcel.readSerializable();
        }
    }

    SmallMessageSnapshot(Parcel parcel) {
        super(parcel);
    }

    public static class ConnectedMessageSnapshot extends SmallMessageSnapshot {

        /* renamed from: h */
        private final boolean f32994h;

        /* renamed from: i */
        private final int f32995i;

        /* renamed from: j */
        private final String f32996j;

        /* renamed from: k */
        private final String f32997k;

        ConnectedMessageSnapshot(int i2, boolean z, int i3, String str, String str2) {
            super(i2);
            this.f32994h = z;
            this.f32995i = i3;
            this.f32996j = str;
            this.f32997k = str2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: c */
        public String mo27524c() {
            return this.f32996j;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: d */
        public String mo27525d() {
            return this.f32997k;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: j */
        public int mo27521j() {
            return this.f32995i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: k */
        public byte mo27519k() {
            return (byte) 2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        /* renamed from: n */
        public boolean mo27526n() {
            return this.f32994h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f32994h ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f32995i);
            parcel.writeString(this.f32996j);
            parcel.writeString(this.f32997k);
        }

        ConnectedMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f32994h = parcel.readByte() != 0;
            this.f32995i = parcel.readInt();
            this.f32996j = parcel.readString();
            this.f32997k = parcel.readString();
        }
    }
}
