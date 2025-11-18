package org.parceler;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.parceler.C11187d;
import org.parceler.p455g.AbstractC11190a;
import org.parceler.p455g.AbstractC11193d;
import org.parceler.p455g.AbstractC11194e;
import org.parceler.p455g.AbstractC11195f;
import org.parceler.p455g.AbstractC11196g;
import org.parceler.p455g.AbstractC11197h;
import org.parceler.p455g.AbstractC11198i;
import org.parceler.p455g.AbstractC11200k;
import org.parceler.p455g.AbstractC11201l;
import org.parceler.p455g.AbstractC11202m;
import org.parceler.p455g.AbstractC11203n;
import org.parceler.p455g.C11191b;
import org.parceler.p455g.C11192c;

/* loaded from: classes3.dex */
final class NonParcelRepository implements InterfaceC11188e<C11187d.c> {

    /* renamed from: a */
    private static final NonParcelRepository f41962a = new NonParcelRepository();

    /* renamed from: b */
    private final Map<Class, C11187d.c> f41963b;

    public static final class BooleanArrayParcelable extends ConverterParcelable<boolean[]> {

        /* renamed from: h */
        private static final C11191b f41964h = new C11191b();
        public static final C11114a CREATOR = new C11114a();

        /* renamed from: org.parceler.NonParcelRepository$BooleanArrayParcelable$a */
        private static final class C11114a implements Parcelable.Creator<BooleanArrayParcelable> {
            private C11114a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BooleanArrayParcelable createFromParcel(Parcel parcel) {
                return new BooleanArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public BooleanArrayParcelable[] newArray(int i2) {
                return new BooleanArrayParcelable[i2];
            }
        }

        public BooleanArrayParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41964h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public BooleanArrayParcelable(boolean[] zArr) {
            super(zArr, f41964h);
        }
    }

    public static final class BooleanParcelable extends ConverterParcelable<Boolean> {

        /* renamed from: h */
        private static final AbstractC11200k<Boolean> f41965h = new C11115a();
        public static final C11116b CREATOR = new C11116b();

        /* renamed from: org.parceler.NonParcelRepository$BooleanParcelable$a */
        static class C11115a extends AbstractC11200k<Boolean> {
            C11115a() {
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Boolean mo39757c(Parcel parcel) {
                return Boolean.valueOf(parcel.createBooleanArray()[0]);
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(Boolean bool, Parcel parcel) {
                parcel.writeBooleanArray(new boolean[]{bool.booleanValue()});
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$BooleanParcelable$b */
        private static final class C11116b implements Parcelable.Creator<BooleanParcelable> {
            private C11116b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BooleanParcelable createFromParcel(Parcel parcel) {
                return new BooleanParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public BooleanParcelable[] newArray(int i2) {
                return new BooleanParcelable[i2];
            }
        }

        public BooleanParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41965h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public BooleanParcelable(boolean z) {
            super(Boolean.valueOf(z), f41965h);
        }
    }

    public static final class ByteArrayParcelable extends ConverterParcelable<byte[]> {

        /* renamed from: h */
        private static final AbstractC11200k<byte[]> f41966h = new C11117a();
        public static final C11118b CREATOR = new C11118b();

        /* renamed from: org.parceler.NonParcelRepository$ByteArrayParcelable$a */
        static class C11117a extends AbstractC11200k<byte[]> {
            C11117a() {
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public byte[] mo39757c(Parcel parcel) {
                return parcel.createByteArray();
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(byte[] bArr, Parcel parcel) {
                parcel.writeByteArray(bArr);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$ByteArrayParcelable$b */
        private static final class C11118b implements Parcelable.Creator<ByteArrayParcelable> {
            private C11118b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ByteArrayParcelable createFromParcel(Parcel parcel) {
                return new ByteArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ByteArrayParcelable[] newArray(int i2) {
                return new ByteArrayParcelable[i2];
            }
        }

        public ByteArrayParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41966h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public ByteArrayParcelable(byte[] bArr) {
            super(bArr, f41966h);
        }
    }

    public static final class ByteParcelable extends ConverterParcelable<Byte> {

        /* renamed from: h */
        private static final AbstractC11200k<Byte> f41967h = new C11119a();
        public static final C11120b CREATOR = new C11120b();

        /* renamed from: org.parceler.NonParcelRepository$ByteParcelable$a */
        static class C11119a extends AbstractC11200k<Byte> {
            C11119a() {
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Byte mo39757c(Parcel parcel) {
                return Byte.valueOf(parcel.readByte());
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(Byte b2, Parcel parcel) {
                parcel.writeByte(b2.byteValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$ByteParcelable$b */
        private static final class C11120b implements Parcelable.Creator<ByteParcelable> {
            private C11120b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ByteParcelable createFromParcel(Parcel parcel) {
                return new ByteParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ByteParcelable[] newArray(int i2) {
                return new ByteParcelable[i2];
            }
        }

        public ByteParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41967h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public ByteParcelable(Byte b2) {
            super(b2, f41967h);
        }
    }

    public static final class CharArrayParcelable extends ConverterParcelable<char[]> {

        /* renamed from: h */
        private static final C11192c f41968h = new C11192c();
        public static final C11121a CREATOR = new C11121a();

        /* renamed from: org.parceler.NonParcelRepository$CharArrayParcelable$a */
        private static final class C11121a implements Parcelable.Creator<CharArrayParcelable> {
            private C11121a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CharArrayParcelable createFromParcel(Parcel parcel) {
                return new CharArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CharArrayParcelable[] newArray(int i2) {
                return new CharArrayParcelable[i2];
            }
        }

        public CharArrayParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41968h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public CharArrayParcelable(char[] cArr) {
            super(cArr, f41968h);
        }
    }

    public static final class CharacterParcelable extends ConverterParcelable<Character> {

        /* renamed from: h */
        private static final AbstractC11200k<Character> f41969h = new C11122a();
        public static final C11123b CREATOR = new C11123b();

        /* renamed from: org.parceler.NonParcelRepository$CharacterParcelable$a */
        static class C11122a extends AbstractC11200k<Character> {
            C11122a() {
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Character mo39757c(Parcel parcel) {
                return Character.valueOf(parcel.createCharArray()[0]);
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(Character ch, Parcel parcel) {
                parcel.writeCharArray(new char[]{ch.charValue()});
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$CharacterParcelable$b */
        private static final class C11123b implements Parcelable.Creator<CharacterParcelable> {
            private C11123b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CharacterParcelable createFromParcel(Parcel parcel) {
                return new CharacterParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CharacterParcelable[] newArray(int i2) {
                return new CharacterParcelable[i2];
            }
        }

        public CharacterParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41969h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public CharacterParcelable(Character ch) {
            super(ch, f41969h);
        }
    }

    public static final class CollectionParcelable extends ConverterParcelable<Collection> {

        /* renamed from: h */
        private static final AbstractC11193d f41970h = new C11124a();
        public static final C11125b CREATOR = new C11125b();

        /* renamed from: org.parceler.NonParcelRepository$CollectionParcelable$a */
        static class C11124a extends AbstractC11190a {
            C11124a() {
            }

            @Override // org.parceler.p455g.AbstractC11193d
            /* renamed from: e */
            public Object mo39777e(Parcel parcel) {
                return C11187d.m39873a(parcel.readParcelable(CollectionParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11193d
            /* renamed from: f */
            public void mo39778f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11187d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$CollectionParcelable$b */
        private static final class C11125b implements Parcelable.Creator<CollectionParcelable> {
            private C11125b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CollectionParcelable createFromParcel(Parcel parcel) {
                return new CollectionParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CollectionParcelable[] newArray(int i2) {
                return new CollectionParcelable[i2];
            }
        }

        public CollectionParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41970h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public CollectionParcelable(Collection collection) {
            super(collection, f41970h);
        }
    }

    public static final class DoubleParcelable extends ConverterParcelable<Double> {

        /* renamed from: h */
        private static final AbstractC11200k<Double> f41973h = new C11126a();
        public static final C11127b CREATOR = new C11127b();

        /* renamed from: org.parceler.NonParcelRepository$DoubleParcelable$a */
        static class C11126a extends AbstractC11200k<Double> {
            C11126a() {
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Double mo39757c(Parcel parcel) {
                return Double.valueOf(parcel.readDouble());
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(Double d2, Parcel parcel) {
                parcel.writeDouble(d2.doubleValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$DoubleParcelable$b */
        private static final class C11127b implements Parcelable.Creator<DoubleParcelable> {
            private C11127b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DoubleParcelable createFromParcel(Parcel parcel) {
                return new DoubleParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public DoubleParcelable[] newArray(int i2) {
                return new DoubleParcelable[i2];
            }
        }

        public DoubleParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41973h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public DoubleParcelable(Double d2) {
            super(d2, f41973h);
        }
    }

    public static final class FloatParcelable extends ConverterParcelable<Float> {

        /* renamed from: h */
        private static final AbstractC11200k<Float> f41974h = new C11128a();
        public static final C11129b CREATOR = new C11129b();

        /* renamed from: org.parceler.NonParcelRepository$FloatParcelable$a */
        static class C11128a extends AbstractC11200k<Float> {
            C11128a() {
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Float mo39757c(Parcel parcel) {
                return Float.valueOf(parcel.readFloat());
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(Float f2, Parcel parcel) {
                parcel.writeFloat(f2.floatValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$FloatParcelable$b */
        private static final class C11129b implements Parcelable.Creator<FloatParcelable> {
            private C11129b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public FloatParcelable createFromParcel(Parcel parcel) {
                return new FloatParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public FloatParcelable[] newArray(int i2) {
                return new FloatParcelable[i2];
            }
        }

        public FloatParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41974h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public FloatParcelable(Float f2) {
            super(f2, f41974h);
        }
    }

    public static final class IBinderParcelable extends ConverterParcelable<IBinder> {

        /* renamed from: h */
        private static final AbstractC11200k<IBinder> f41975h = new C11130a();
        public static final C11131b CREATOR = new C11131b();

        /* renamed from: org.parceler.NonParcelRepository$IBinderParcelable$a */
        static class C11130a extends AbstractC11200k<IBinder> {
            C11130a() {
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public IBinder mo39757c(Parcel parcel) {
                return parcel.readStrongBinder();
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(IBinder iBinder, Parcel parcel) {
                parcel.writeStrongBinder(iBinder);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$IBinderParcelable$b */
        private static final class C11131b implements Parcelable.Creator<IBinderParcelable> {
            private C11131b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public IBinderParcelable createFromParcel(Parcel parcel) {
                return new IBinderParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public IBinderParcelable[] newArray(int i2) {
                return new IBinderParcelable[i2];
            }
        }

        public IBinderParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41975h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public IBinderParcelable(IBinder iBinder) {
            super(iBinder, f41975h);
        }
    }

    public static final class IntegerParcelable extends ConverterParcelable<Integer> {

        /* renamed from: h */
        private static final AbstractC11200k<Integer> f41976h = new C11132a();
        public static final C11133b CREATOR = new C11133b();

        /* renamed from: org.parceler.NonParcelRepository$IntegerParcelable$a */
        static class C11132a extends AbstractC11200k<Integer> {
            C11132a() {
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Integer mo39757c(Parcel parcel) {
                return Integer.valueOf(parcel.readInt());
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(Integer num, Parcel parcel) {
                parcel.writeInt(num.intValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$IntegerParcelable$b */
        private static final class C11133b implements Parcelable.Creator<IntegerParcelable> {
            private C11133b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public IntegerParcelable createFromParcel(Parcel parcel) {
                return new IntegerParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public IntegerParcelable[] newArray(int i2) {
                return new IntegerParcelable[i2];
            }
        }

        public IntegerParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41976h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public IntegerParcelable(Integer num) {
            super(num, f41976h);
        }
    }

    public static final class LinkedHashMapParcelable extends ConverterParcelable<LinkedHashMap> {

        /* renamed from: h */
        private static final AbstractC11196g f41977h = new C11134a();
        public static final C11135b CREATOR = new C11135b();

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashMapParcelable$a */
        static class C11134a extends AbstractC11196g {
            C11134a() {
            }

            @Override // org.parceler.p455g.AbstractC11199j
            /* renamed from: e */
            public Object mo39797e(Parcel parcel) {
                return C11187d.m39873a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11199j
            /* renamed from: f */
            public void mo39798f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11187d.m39875c(obj), 0);
            }

            @Override // org.parceler.p455g.AbstractC11199j
            /* renamed from: g */
            public Object mo39799g(Parcel parcel) {
                return C11187d.m39873a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11199j
            /* renamed from: h */
            public void mo39800h(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11187d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashMapParcelable$b */
        private static final class C11135b implements Parcelable.Creator<LinkedHashMapParcelable> {
            private C11135b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LinkedHashMapParcelable createFromParcel(Parcel parcel) {
                return new LinkedHashMapParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LinkedHashMapParcelable[] newArray(int i2) {
                return new LinkedHashMapParcelable[i2];
            }
        }

        public LinkedHashMapParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41977h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public LinkedHashMapParcelable(LinkedHashMap linkedHashMap) {
            super(linkedHashMap, f41977h);
        }
    }

    public static final class LinkedHashSetParcelable extends ConverterParcelable<LinkedHashSet> {

        /* renamed from: h */
        private static final AbstractC11197h f41978h = new C11136a();
        public static final C11137b CREATOR = new C11137b();

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashSetParcelable$a */
        static class C11136a extends AbstractC11197h {
            C11136a() {
            }

            @Override // org.parceler.p455g.AbstractC11193d
            /* renamed from: e */
            public Object mo39777e(Parcel parcel) {
                return C11187d.m39873a(parcel.readParcelable(LinkedHashSetParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11193d
            /* renamed from: f */
            public void mo39778f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11187d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashSetParcelable$b */
        private static final class C11137b implements Parcelable.Creator<LinkedHashSetParcelable> {
            private C11137b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LinkedHashSetParcelable createFromParcel(Parcel parcel) {
                return new LinkedHashSetParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LinkedHashSetParcelable[] newArray(int i2) {
                return new LinkedHashSetParcelable[i2];
            }
        }

        public LinkedHashSetParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41978h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public LinkedHashSetParcelable(LinkedHashSet linkedHashSet) {
            super(linkedHashSet, f41978h);
        }
    }

    public static final class LinkedListParcelable extends ConverterParcelable<LinkedList> {

        /* renamed from: h */
        private static final AbstractC11198i f41979h = new C11138a();
        public static final C11139b CREATOR = new C11139b();

        /* renamed from: org.parceler.NonParcelRepository$LinkedListParcelable$a */
        static class C11138a extends AbstractC11198i {
            C11138a() {
            }

            @Override // org.parceler.p455g.AbstractC11193d
            /* renamed from: e */
            public Object mo39777e(Parcel parcel) {
                return C11187d.m39873a(parcel.readParcelable(LinkedListParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11193d
            /* renamed from: f */
            public void mo39778f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11187d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LinkedListParcelable$b */
        private static final class C11139b implements Parcelable.Creator<LinkedListParcelable> {
            private C11139b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LinkedListParcelable createFromParcel(Parcel parcel) {
                return new LinkedListParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LinkedListParcelable[] newArray(int i2) {
                return new LinkedListParcelable[i2];
            }
        }

        public LinkedListParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41979h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public LinkedListParcelable(LinkedList linkedList) {
            super(linkedList, f41979h);
        }
    }

    public static final class ListParcelable extends ConverterParcelable<List> {

        /* renamed from: h */
        private static final AbstractC11190a f41980h = new C11140a();
        public static final C11141b CREATOR = new C11141b();

        /* renamed from: org.parceler.NonParcelRepository$ListParcelable$a */
        static class C11140a extends AbstractC11190a {
            C11140a() {
            }

            @Override // org.parceler.p455g.AbstractC11193d
            /* renamed from: e */
            public Object mo39777e(Parcel parcel) {
                return C11187d.m39873a(parcel.readParcelable(ListParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11193d
            /* renamed from: f */
            public void mo39778f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11187d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$ListParcelable$b */
        private static final class C11141b implements Parcelable.Creator<ListParcelable> {
            private C11141b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ListParcelable createFromParcel(Parcel parcel) {
                return new ListParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ListParcelable[] newArray(int i2) {
                return new ListParcelable[i2];
            }
        }

        public ListParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41980h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public ListParcelable(List list) {
            super(list, f41980h);
        }
    }

    public static final class LongParcelable extends ConverterParcelable<Long> {

        /* renamed from: h */
        private static final AbstractC11200k<Long> f41981h = new C11142a();
        public static final C11143b CREATOR = new C11143b();

        /* renamed from: org.parceler.NonParcelRepository$LongParcelable$a */
        static class C11142a extends AbstractC11200k<Long> {
            C11142a() {
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Long mo39757c(Parcel parcel) {
                return Long.valueOf(parcel.readLong());
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(Long l, Parcel parcel) {
                parcel.writeLong(l.longValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LongParcelable$b */
        private static final class C11143b implements Parcelable.Creator<LongParcelable> {
            private C11143b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LongParcelable createFromParcel(Parcel parcel) {
                return new LongParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LongParcelable[] newArray(int i2) {
                return new LongParcelable[i2];
            }
        }

        public LongParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41981h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public LongParcelable(Long l) {
            super(l, f41981h);
        }
    }

    public static final class MapParcelable extends ConverterParcelable<Map> {

        /* renamed from: h */
        private static final AbstractC11194e f41982h = new C11144a();
        public static final C11145b CREATOR = new C11145b();

        /* renamed from: org.parceler.NonParcelRepository$MapParcelable$a */
        static class C11144a extends AbstractC11194e {
            C11144a() {
            }

            @Override // org.parceler.p455g.AbstractC11199j
            /* renamed from: e */
            public Object mo39797e(Parcel parcel) {
                return C11187d.m39873a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11199j
            /* renamed from: f */
            public void mo39798f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11187d.m39875c(obj), 0);
            }

            @Override // org.parceler.p455g.AbstractC11199j
            /* renamed from: g */
            public Object mo39799g(Parcel parcel) {
                return C11187d.m39873a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11199j
            /* renamed from: h */
            public void mo39800h(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11187d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$MapParcelable$b */
        private static final class C11145b implements Parcelable.Creator<MapParcelable> {
            private C11145b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MapParcelable createFromParcel(Parcel parcel) {
                return new MapParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public MapParcelable[] newArray(int i2) {
                return new MapParcelable[i2];
            }
        }

        public MapParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41982h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public MapParcelable(Map map) {
            super(map, f41982h);
        }
    }

    public static final class SetParcelable extends ConverterParcelable<Set> {

        /* renamed from: h */
        private static final AbstractC11195f f41984h = new C11147a();
        public static final C11148b CREATOR = new C11148b();

        /* renamed from: org.parceler.NonParcelRepository$SetParcelable$a */
        static class C11147a extends AbstractC11195f {
            C11147a() {
            }

            @Override // org.parceler.p455g.AbstractC11193d
            /* renamed from: e */
            public Object mo39777e(Parcel parcel) {
                return C11187d.m39873a(parcel.readParcelable(SetParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11193d
            /* renamed from: f */
            public void mo39778f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11187d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$SetParcelable$b */
        private static final class C11148b implements Parcelable.Creator<SetParcelable> {
            private C11148b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SetParcelable createFromParcel(Parcel parcel) {
                return new SetParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SetParcelable[] newArray(int i2) {
                return new SetParcelable[i2];
            }
        }

        public SetParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41984h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public SetParcelable(Set set) {
            super(set, f41984h);
        }
    }

    public static final class SparseArrayParcelable extends ConverterParcelable<SparseArray> {

        /* renamed from: h */
        private static final AbstractC11201l f41985h = new C11149a();
        public static final C11150b CREATOR = new C11150b();

        /* renamed from: org.parceler.NonParcelRepository$SparseArrayParcelable$a */
        static class C11149a extends AbstractC11201l {
            C11149a() {
            }

            @Override // org.parceler.p455g.AbstractC11201l
            /* renamed from: d */
            public Object mo39820d(Parcel parcel) {
                return C11187d.m39873a(parcel.readParcelable(SparseArrayParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11201l
            /* renamed from: e */
            public void mo39821e(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11187d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$SparseArrayParcelable$b */
        private static final class C11150b implements Parcelable.Creator<SparseArrayParcelable> {
            private C11150b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SparseArrayParcelable createFromParcel(Parcel parcel) {
                return new SparseArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SparseArrayParcelable[] newArray(int i2) {
                return new SparseArrayParcelable[i2];
            }
        }

        public SparseArrayParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41985h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public SparseArrayParcelable(SparseArray sparseArray) {
            super(sparseArray, f41985h);
        }
    }

    public static final class SparseBooleanArrayParcelable extends ConverterParcelable<SparseBooleanArray> {

        /* renamed from: h */
        private static final AbstractC11200k<SparseBooleanArray> f41986h = new C11151a();
        public static final C11152b CREATOR = new C11152b();

        /* renamed from: org.parceler.NonParcelRepository$SparseBooleanArrayParcelable$a */
        static class C11151a extends AbstractC11200k<SparseBooleanArray> {
            C11151a() {
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public SparseBooleanArray mo39757c(Parcel parcel) {
                return parcel.readSparseBooleanArray();
            }

            @Override // org.parceler.p455g.AbstractC11200k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(SparseBooleanArray sparseBooleanArray, Parcel parcel) {
                parcel.writeSparseBooleanArray(sparseBooleanArray);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$SparseBooleanArrayParcelable$b */
        private static final class C11152b implements Parcelable.Creator<SparseBooleanArrayParcelable> {
            private C11152b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SparseBooleanArrayParcelable createFromParcel(Parcel parcel) {
                return new SparseBooleanArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SparseBooleanArrayParcelable[] newArray(int i2) {
                return new SparseBooleanArrayParcelable[i2];
            }
        }

        public SparseBooleanArrayParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41986h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public SparseBooleanArrayParcelable(SparseBooleanArray sparseBooleanArray) {
            super(sparseBooleanArray, f41986h);
        }
    }

    public static final class TreeMapParcelable extends ConverterParcelable<Map> {

        /* renamed from: h */
        private static final AbstractC11202m f41988h = new C11154a();
        public static final C11155b CREATOR = new C11155b();

        /* renamed from: org.parceler.NonParcelRepository$TreeMapParcelable$a */
        static class C11154a extends AbstractC11202m {
            C11154a() {
            }

            @Override // org.parceler.p455g.AbstractC11199j
            /* renamed from: e */
            public Object mo39797e(Parcel parcel) {
                return C11187d.m39873a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11199j
            /* renamed from: f */
            public void mo39798f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11187d.m39875c(obj), 0);
            }

            @Override // org.parceler.p455g.AbstractC11199j
            /* renamed from: g */
            public Object mo39799g(Parcel parcel) {
                return C11187d.m39873a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11199j
            /* renamed from: h */
            public void mo39800h(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11187d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$TreeMapParcelable$b */
        private static final class C11155b implements Parcelable.Creator<TreeMapParcelable> {
            private C11155b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TreeMapParcelable createFromParcel(Parcel parcel) {
                return new TreeMapParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public TreeMapParcelable[] newArray(int i2) {
                return new TreeMapParcelable[i2];
            }
        }

        public TreeMapParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41988h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public TreeMapParcelable(Map map) {
            super(map, f41988h);
        }
    }

    public static final class TreeSetParcelable extends ConverterParcelable<Set> {

        /* renamed from: h */
        private static final AbstractC11203n f41989h = new C11156a();
        public static final C11157b CREATOR = new C11157b();

        /* renamed from: org.parceler.NonParcelRepository$TreeSetParcelable$a */
        static class C11156a extends AbstractC11203n {
            C11156a() {
            }

            @Override // org.parceler.p455g.AbstractC11193d
            /* renamed from: e */
            public Object mo39777e(Parcel parcel) {
                return C11187d.m39873a(parcel.readParcelable(TreeSetParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11193d
            /* renamed from: f */
            public void mo39778f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11187d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$TreeSetParcelable$b */
        private static final class C11157b implements Parcelable.Creator<TreeSetParcelable> {
            private C11157b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TreeSetParcelable createFromParcel(Parcel parcel) {
                return new TreeSetParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public TreeSetParcelable[] newArray(int i2) {
                return new TreeSetParcelable[i2];
            }
        }

        public TreeSetParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11189f) f41989h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public TreeSetParcelable(Set set) {
            super(set, f41989h);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$b */
    private static class C11159b implements C11187d.c<boolean[]> {
        private C11159b() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(boolean[] zArr) {
            return new BooleanArrayParcelable(zArr);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$c */
    private static class C11160c implements C11187d.c<Boolean> {
        private C11160c() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Boolean bool) {
            return new BooleanParcelable(bool.booleanValue());
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$d */
    private static class C11161d implements C11187d.c<Bundle> {
        private C11161d() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Bundle bundle) {
            return bundle;
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$e */
    private static class C11162e implements C11187d.c<byte[]> {
        private C11162e() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(byte[] bArr) {
            return new ByteArrayParcelable(bArr);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$f */
    private static class C11163f implements C11187d.c<Byte> {
        private C11163f() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Byte b2) {
            return new ByteParcelable(b2);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$g */
    private static class C11164g implements C11187d.c<char[]> {
        private C11164g() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(char[] cArr) {
            return new CharArrayParcelable(cArr);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$h */
    private static class C11165h implements C11187d.c<Character> {
        private C11165h() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Character ch) {
            return new CharacterParcelable(ch);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$i */
    private static class C11166i implements C11187d.c<Collection> {
        private C11166i() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Collection collection) {
            return new CollectionParcelable(collection);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$j */
    private static class C11167j implements C11187d.c<Double> {
        private C11167j() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Double d2) {
            return new DoubleParcelable(d2);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$k */
    private static class C11168k implements C11187d.c<Float> {
        private C11168k() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Float f2) {
            return new FloatParcelable(f2);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$l */
    private static class C11169l implements C11187d.c<IBinder> {
        private C11169l() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(IBinder iBinder) {
            return new IBinderParcelable(iBinder);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$m */
    private static class C11170m implements C11187d.c<Integer> {
        private C11170m() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Integer num) {
            return new IntegerParcelable(num);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$n */
    private static class C11171n implements C11187d.c<LinkedHashMap> {
        private C11171n() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(LinkedHashMap linkedHashMap) {
            return new LinkedHashMapParcelable(linkedHashMap);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$o */
    private static class C11172o implements C11187d.c<LinkedHashSet> {
        private C11172o() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(LinkedHashSet linkedHashSet) {
            return new LinkedHashSetParcelable(linkedHashSet);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$p */
    private static class C11173p implements C11187d.c<LinkedList> {
        private C11173p() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(LinkedList linkedList) {
            return new LinkedListParcelable(linkedList);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$q */
    private static class C11174q implements C11187d.c<List> {
        private C11174q() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(List list) {
            return new ListParcelable(list);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$r */
    private static class C11175r implements C11187d.c<Long> {
        private C11175r() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Long l) {
            return new LongParcelable(l);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$s */
    private static class C11176s implements C11187d.c<Map> {
        private C11176s() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Map map) {
            return new MapParcelable(map);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$t */
    static class C11177t implements C11187d.c<Parcelable> {
        C11177t() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Parcelable parcelable) {
            return new ParcelableParcelable(parcelable);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$u */
    private static class C11178u implements C11187d.c<Set> {
        private C11178u() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Set set) {
            return new SetParcelable(set);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$v */
    private static class C11179v implements C11187d.c<SparseArray> {
        private C11179v() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(SparseArray sparseArray) {
            return new SparseArrayParcelable(sparseArray);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$w */
    private static class C11180w implements C11187d.c<SparseBooleanArray> {
        private C11180w() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(SparseBooleanArray sparseBooleanArray) {
            return new SparseBooleanArrayParcelable(sparseBooleanArray);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$x */
    private static class C11181x implements C11187d.c<String> {
        private C11181x() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(String str) {
            return new StringParcelable(str);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$y */
    private static class C11182y implements C11187d.c<Map> {
        private C11182y() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Map map) {
            return new TreeMapParcelable(map);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$z */
    private static class C11183z implements C11187d.c<Set> {
        private C11183z() {
        }

        @Override // org.parceler.C11187d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Set set) {
            return new TreeSetParcelable(set);
        }
    }

    private NonParcelRepository() {
        HashMap map = new HashMap();
        this.f41963b = map;
        map.put(Collection.class, new C11166i());
        map.put(List.class, new C11174q());
        map.put(ArrayList.class, new C11174q());
        map.put(Set.class, new C11178u());
        map.put(HashSet.class, new C11178u());
        map.put(TreeSet.class, new C11183z());
        map.put(SparseArray.class, new C11179v());
        map.put(Map.class, new C11176s());
        map.put(HashMap.class, new C11176s());
        map.put(TreeMap.class, new C11182y());
        map.put(Integer.class, new C11170m());
        map.put(Long.class, new C11175r());
        map.put(Double.class, new C11167j());
        map.put(Float.class, new C11168k());
        map.put(Byte.class, new C11163f());
        map.put(String.class, new C11181x());
        map.put(Character.class, new C11165h());
        map.put(Boolean.class, new C11160c());
        map.put(byte[].class, new C11162e());
        map.put(char[].class, new C11164g());
        map.put(boolean[].class, new C11159b());
        map.put(IBinder.class, new C11169l());
        map.put(Bundle.class, new C11161d());
        map.put(SparseBooleanArray.class, new C11180w());
        map.put(LinkedList.class, new C11173p());
        map.put(LinkedHashMap.class, new C11171n());
        map.put(SortedMap.class, new C11182y());
        map.put(SortedSet.class, new C11183z());
        map.put(LinkedHashSet.class, new C11172o());
    }

    /* renamed from: a */
    public static NonParcelRepository m39754a() {
        return f41962a;
    }

    @Override // org.parceler.InterfaceC11188e
    public Map<Class, C11187d.c> get() {
        return this.f41963b;
    }

    private static class ConverterParcelable<T> implements Parcelable, InterfaceC11186c<T> {

        /* renamed from: f */
        private final T f41971f;

        /* renamed from: g */
        private final InterfaceC11189f<T, T> f41972g;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // org.parceler.InterfaceC11186c
        public T getParcel() {
            return this.f41971f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.f41972g.mo39881b(this.f41971f, parcel);
        }

        private ConverterParcelable(Parcel parcel, InterfaceC11189f<T, T> interfaceC11189f) {
            this(interfaceC11189f.mo39880a(parcel), interfaceC11189f);
        }

        private ConverterParcelable(T t, InterfaceC11189f<T, T> interfaceC11189f) {
            this.f41972g = interfaceC11189f;
            this.f41971f = t;
        }
    }

    public static final class ParcelableParcelable implements Parcelable, InterfaceC11186c<Parcelable> {
        public static final C11146a CREATOR = new C11146a();

        /* renamed from: f */
        private Parcelable f41983f;

        /* renamed from: org.parceler.NonParcelRepository$ParcelableParcelable$a */
        private static final class C11146a implements Parcelable.Creator<ParcelableParcelable> {
            private C11146a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableParcelable createFromParcel(Parcel parcel) {
                return new ParcelableParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ParcelableParcelable[] newArray(int i2) {
                return new ParcelableParcelable[i2];
            }
        }

        @Override // org.parceler.InterfaceC11186c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Parcelable getParcel() {
            return this.f41983f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f41983f, i2);
        }

        private ParcelableParcelable(Parcel parcel) {
            this.f41983f = parcel.readParcelable(ParcelableParcelable.class.getClassLoader());
        }

        private ParcelableParcelable(Parcelable parcelable) {
            this.f41983f = parcelable;
        }
    }

    public static final class StringParcelable implements Parcelable, InterfaceC11186c<String> {
        public static final C11153a CREATOR = new C11153a();

        /* renamed from: f */
        private String f41987f;

        /* renamed from: org.parceler.NonParcelRepository$StringParcelable$a */
        private static final class C11153a implements Parcelable.Creator<StringParcelable> {
            private C11153a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public StringParcelable createFromParcel(Parcel parcel) {
                return new StringParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public StringParcelable[] newArray(int i2) {
                return new StringParcelable[i2];
            }
        }

        @Override // org.parceler.InterfaceC11186c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String getParcel() {
            return this.f41987f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f41987f);
        }

        private StringParcelable(Parcel parcel) {
            this.f41987f = parcel.readString();
        }

        private StringParcelable(String str) {
            this.f41987f = str;
        }
    }
}
