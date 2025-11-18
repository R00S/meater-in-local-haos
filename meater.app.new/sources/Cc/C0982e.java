package Cc;

import com.squareup.wire.internal.MathMethodsKt;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: Buffer.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002³\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0011H\u0087\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0011H\u0016¢\u0006\u0004\b/\u0010\"J\u000f\u00100\u001a\u00020)H\u0016¢\u0006\u0004\b0\u0010+J\u000f\u00101\u001a\u00020,H\u0016¢\u0006\u0004\b1\u0010.J\u000f\u00102\u001a\u00020\u0011H\u0016¢\u0006\u0004\b2\u0010\"J\u000f\u00103\u001a\u00020\u0011H\u0016¢\u0006\u0004\b3\u0010\"J\u000f\u00104\u001a\u00020\u0011H\u0016¢\u0006\u0004\b4\u0010\"J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u0002052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00112\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020B2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020B2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020B2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020BH\u0016¢\u0006\u0004\bM\u0010DJ\u0017\u0010O\u001a\u00020B2\u0006\u0010N\u001a\u00020\u0011H\u0016¢\u0006\u0004\bO\u0010FJ\u000f\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020P2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00132\u0006\u0010?\u001a\u00020PH\u0016¢\u0006\u0004\bU\u0010VJ'\u0010W\u001a\u00020,2\u0006\u0010?\u001a\u00020P2\u0006\u0010\u001e\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020,H\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020,2\u0006\u0010?\u001a\u00020YH\u0016¢\u0006\u0004\bZ\u0010[J\r\u0010\\\u001a\u00020\u0013¢\u0006\u0004\b\\\u0010\u0006J\u0017\u0010]\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b]\u0010\u0015J\u0017\u0010_\u001a\u00020\u00002\u0006\u0010^\u001a\u000205H\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\u00002\u0006\u0010a\u001a\u00020BH\u0016¢\u0006\u0004\bb\u0010cJ'\u0010f\u001a\u00020\u00002\u0006\u0010a\u001a\u00020B2\u0006\u0010d\u001a\u00020,2\u0006\u0010e\u001a\u00020,H\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020\u00002\u0006\u0010h\u001a\u00020,H\u0016¢\u0006\u0004\bi\u0010jJ/\u0010k\u001a\u00020\u00002\u0006\u0010a\u001a\u00020B2\u0006\u0010d\u001a\u00020,2\u0006\u0010e\u001a\u00020,2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\u00020\u00002\u0006\u0010m\u001a\u00020PH\u0016¢\u0006\u0004\bn\u0010oJ'\u0010p\u001a\u00020\u00002\u0006\u0010m\u001a\u00020P2\u0006\u0010\u001e\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020,H\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020,2\u0006\u0010m\u001a\u00020YH\u0016¢\u0006\u0004\br\u0010[J\u0017\u0010t\u001a\u00020\u00112\u0006\u0010m\u001a\u00020sH\u0016¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020,H\u0016¢\u0006\u0004\bv\u0010jJ\u0017\u0010w\u001a\u00020\u00002\u0006\u0010W\u001a\u00020,H\u0016¢\u0006\u0004\bw\u0010jJ\u0017\u0010y\u001a\u00020\u00002\u0006\u0010x\u001a\u00020,H\u0016¢\u0006\u0004\by\u0010jJ\u0017\u0010z\u001a\u00020\u00002\u0006\u0010x\u001a\u00020,H\u0016¢\u0006\u0004\bz\u0010jJ\u0017\u0010|\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u0011H\u0016¢\u0006\u0004\b|\u0010}J\u0017\u0010~\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u0011H\u0016¢\u0006\u0004\b~\u0010}J\u0017\u0010\u007f\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u007f\u0010}J\u0019\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u0011H\u0016¢\u0006\u0005\b\u0080\u0001\u0010}J\u001c\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0081\u0001\u001a\u00020,H\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\"\u0010\u0085\u0001\u001a\u00020\u00132\u0006\u0010m\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\"\u0010\u0087\u0001\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J,\u0010\u008b\u0001\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020#2\u0007\u0010\u0089\u0001\u001a\u00020\u00112\u0007\u0010\u008a\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001b\u0010\u008e\u0001\u001a\u00020\u00112\u0007\u0010\u008d\u0001\u001a\u000205H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J$\u0010\u0090\u0001\u001a\u00020\u00112\u0007\u0010\u008d\u0001\u001a\u0002052\u0007\u0010\u0089\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001b\u0010\u0093\u0001\u001a\u00020\u00112\u0007\u0010\u0092\u0001\u001a\u000205H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u008f\u0001J$\u0010\u0094\u0001\u001a\u00020\u00112\u0007\u0010\u0092\u0001\u001a\u0002052\u0007\u0010\u0089\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0091\u0001J\u0011\u0010\u0095\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0095\u0001\u0010\u0006J\u0011\u0010\u0096\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0096\u0001\u0010\u0010J\u0011\u0010\u0097\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0097\u0001\u0010\u0006J\u0013\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001f\u0010\u009d\u0001\u001a\u00020\u000e2\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0096\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0011\u0010\u009f\u0001\u001a\u00020,H\u0016¢\u0006\u0005\b\u009f\u0001\u0010.J\u0011\u0010 \u0001\u001a\u00020BH\u0016¢\u0006\u0005\b \u0001\u0010DJ\u000f\u0010¡\u0001\u001a\u00020\u0000¢\u0006\u0005\b¡\u0001\u0010\bJ\u0011\u0010¢\u0001\u001a\u00020\u0000H\u0016¢\u0006\u0005\b¢\u0001\u0010\bJ\u000f\u0010£\u0001\u001a\u000205¢\u0006\u0005\b£\u0001\u00107J\u0018\u0010¤\u0001\u001a\u0002052\u0006\u0010\u0012\u001a\u00020,¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001f\u0010¨\u0001\u001a\u00030¦\u00012\n\b\u0002\u0010§\u0001\u001a\u00030¦\u0001H\u0007¢\u0006\u0006\b¨\u0001\u0010©\u0001R\u001c\u0010¬\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R/\u0010±\u0001\u001a\u00020\u00112\u0007\u0010\u00ad\u0001\u001a\u00020\u00118G@@X\u0086\u000e¢\u0006\u0015\n\u0005\bU\u0010®\u0001\u001a\u0005\b¯\u0001\u0010\"\"\u0005\b°\u0001\u0010\u0015R\u0015\u0010²\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010\b¨\u0006´\u0001"}, d2 = {"LCc/e;", "LCc/g;", "LCc/f;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "G", "()LCc/e;", "Ljava/io/OutputStream;", "q", "()Ljava/io/OutputStream;", "l", "k", "", "c0", "()Z", "", "byteCount", "Loa/F;", "t1", "(J)V", "Q0", "(J)Z", "o1", "()LCc/g;", "Ljava/io/InputStream;", "A1", "()Ljava/io/InputStream;", "out", "offset", "g", "(LCc/e;JJ)LCc/e;", "d", "()J", "", "readByte", "()B", "pos", "m", "(J)B", "", "readShort", "()S", "", "readInt", "()I", "L", "N", "Z0", "m1", "m0", "x1", "LCc/h;", "u", "()LCc/h;", "H", "(J)LCc/h;", "LCc/r;", "options", "y1", "(LCc/r;)I", "LCc/z;", "sink", "V0", "(LCc/z;)J", "", "Q", "()Ljava/lang/String;", "D", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "E0", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "P", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "Y0", "limit", "q0", "", "Z", "()[B", "b1", "(J)[B", "C", "([B)V", "s", "([BII)I", "Ljava/nio/ByteBuffer;", "read", "(Ljava/nio/ByteBuffer;)I", "b", "w", "byteString", "p0", "(LCc/h;)LCc/e;", "string", "q1", "(Ljava/lang/String;)LCc/e;", "beginIndex", "endIndex", "s1", "(Ljava/lang/String;II)LCc/e;", "codePoint", "u1", "(I)LCc/e;", "n1", "(Ljava/lang/String;IILjava/nio/charset/Charset;)LCc/e;", "source", "C0", "([B)LCc/e;", "L0", "([BII)LCc/e;", "write", "LCc/B;", "S", "(LCc/B;)J", "M0", "k1", "i", "X0", "a1", "v", "g1", "(J)LCc/e;", "h1", "P0", "S0", "minimumCapacity", "LCc/w;", "o0", "(I)LCc/w;", "n0", "(LCc/e;J)V", "I0", "(LCc/e;J)J", "fromIndex", "toIndex", "n", "(BJJ)J", "bytes", "R0", "(LCc/h;)J", "o", "(LCc/h;J)J", "targetBytes", "j1", "p", "flush", "isOpen", "close", "LCc/C;", "r", "()LCc/C;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "f", "c", "e0", "i0", "(I)LCc/h;", "LCc/e$a;", "unsafeCursor", "t", "(LCc/e$a;)LCc/e$a;", "B", "LCc/w;", "head", "<set-?>", "J", "X", "W", "size", "buffer", "a", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0982e implements g, f, Cloneable, ByteChannel {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public w head;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010#¨\u0006'"}, d2 = {"LCc/e$a;", "Ljava/io/Closeable;", "<init>", "()V", "", "minByteCount", "", "a", "(I)J", "Loa/F;", "close", "LCc/e;", "B", "LCc/e;", "buffer", "", "C", "Z", "readWrite", "LCc/w;", "D", "LCc/w;", "getSegment$okio", "()LCc/w;", "b", "(LCc/w;)V", "segment", "E", "J", "offset", "", "F", "[B", "data", "G", "I", "start", "H", "end", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cc.e$a */
    public static final class a implements Closeable {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        public C0982e buffer;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        public boolean readWrite;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private w segment;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        public byte[] data;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        public long offset = -1;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        public int start = -1;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        public int end = -1;

        public final long a(int minByteCount) {
            if (minByteCount <= 0) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + minByteCount).toString());
            }
            if (minByteCount > 8192) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + minByteCount).toString());
            }
            C0982e c0982e = this.buffer;
            if (c0982e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long size = c0982e.getSize();
            w wVarO0 = c0982e.o0(minByteCount);
            int i10 = 8192 - wVarO0.limit;
            wVarO0.limit = 8192;
            long j10 = i10;
            c0982e.W(size + j10);
            b(wVarO0);
            this.offset = size;
            this.data = wVarO0.data;
            this.start = 8192 - i10;
            this.end = 8192;
            return j10;
        }

        public final void b(w wVar) {
            this.segment = wVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            b(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }
    }

    /* compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Cc/e$c", "Ljava/io/OutputStream;", "", "b", "Loa/F;", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", "close", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cc.e$c */
    public static final class c extends OutputStream {
        c() {
        }

        public String toString() {
            return C0982e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int b10) {
            C0982e.this.d0(b10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int offset, int byteCount) {
            C3862t.g(data, "data");
            C0982e.this.v(data, offset, byteCount);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    @Override // Cc.g
    public InputStream A1() {
        return new b();
    }

    public void C(byte[] sink) throws EOFException {
        C3862t.g(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int iS = s(sink, i10, sink.length - i10);
            if (iS == -1) {
                throw new EOFException();
            }
            i10 += iS;
        }
    }

    @Override // Cc.f
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public C0982e i1(byte[] source) {
        C3862t.g(source, "source");
        return v(source, 0, source.length);
    }

    @Override // Cc.g
    public String D(long byteCount) throws EOFException {
        return P(byteCount, Ub.d.UTF_8);
    }

    @Override // Cc.g
    public String E0(Charset charset) {
        C3862t.g(charset, "charset");
        return P(this.size, charset);
    }

    @Override // Cc.g
    public h H(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new h(b1(byteCount));
        }
        h hVarI0 = i0((int) byteCount);
        w(byteCount);
        return hVarI0;
    }

    @Override // Cc.B
    public long I0(C0982e sink, long byteCount) {
        C3862t.g(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (getSize() == 0) {
            return -1L;
        }
        if (byteCount > getSize()) {
            byteCount = getSize();
        }
        sink.n0(this, byteCount);
        return byteCount;
    }

    public long L() throws EOFException {
        if (getSize() < 8) {
            throw new EOFException();
        }
        w wVar = this.head;
        C3862t.d(wVar);
        int i10 = wVar.pos;
        int i11 = wVar.limit;
        if (i11 - i10 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = wVar.data;
        int i12 = i10 + 7;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (bArr[i12] & 255);
        W(getSize() - 8);
        if (i13 == i11) {
            this.head = wVar.b();
            x.b(wVar);
        } else {
            wVar.pos = i13;
        }
        return j11;
    }

    @Override // Cc.f
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public C0982e v(byte[] source, int offset, int byteCount) {
        C3862t.g(source, "source");
        long j10 = byteCount;
        C0979b.b(source.length, offset, j10);
        int i10 = byteCount + offset;
        while (offset < i10) {
            w wVarO0 = o0(1);
            int iMin = Math.min(i10 - offset, 8192 - wVarO0.limit);
            int i11 = offset + iMin;
            C3831l.h(source, wVarO0.data, wVarO0.limit, offset, i11);
            wVarO0.limit += iMin;
            offset = i11;
        }
        W(getSize() + j10);
        return this;
    }

    @Override // Cc.f
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public C0982e d0(int b10) {
        w wVarO0 = o0(1);
        byte[] bArr = wVarO0.data;
        int i10 = wVarO0.limit;
        wVarO0.limit = i10 + 1;
        bArr[i10] = (byte) b10;
        W(getSize() + 1);
        return this;
    }

    public short N() {
        return C0979b.i(readShort());
    }

    public String P(long byteCount, Charset charset) throws EOFException {
        C3862t.g(charset, "charset");
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        w wVar = this.head;
        C3862t.d(wVar);
        int i10 = wVar.pos;
        if (i10 + byteCount > wVar.limit) {
            return new String(b1(byteCount), charset);
        }
        int i11 = (int) byteCount;
        String str = new String(wVar.data, i10, i11, charset);
        int i12 = wVar.pos + i11;
        wVar.pos = i12;
        this.size -= byteCount;
        if (i12 == wVar.limit) {
            this.head = wVar.b();
            x.b(wVar);
        }
        return str;
    }

    @Override // Cc.f
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public C0982e v1(long v10) {
        boolean z10;
        if (v10 == 0) {
            return d0(48);
        }
        int i10 = 1;
        if (v10 < 0) {
            v10 = -v10;
            if (v10 < 0) {
                return A0("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (v10 >= 100000000) {
            i10 = v10 < 1000000000000L ? v10 < 10000000000L ? v10 < MathMethodsKt.NANOS_PER_SECOND ? 9 : 10 : v10 < 100000000000L ? 11 : 12 : v10 < 1000000000000000L ? v10 < 10000000000000L ? 13 : v10 < 100000000000000L ? 14 : 15 : v10 < 100000000000000000L ? v10 < 10000000000000000L ? 16 : 17 : v10 < 1000000000000000000L ? 18 : 19;
        } else if (v10 >= 10000) {
            i10 = v10 < 1000000 ? v10 < 100000 ? 5 : 6 : v10 < 10000000 ? 7 : 8;
        } else if (v10 >= 100) {
            i10 = v10 < 1000 ? 3 : 4;
        } else if (v10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        w wVarO0 = o0(i10);
        byte[] bArr = wVarO0.data;
        int i11 = wVarO0.limit + i10;
        while (v10 != 0) {
            long j10 = 10;
            i11--;
            bArr[i11] = Dc.a.b()[(int) (v10 % j10)];
            v10 /= j10;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        wVarO0.limit += i10;
        W(getSize() + i10);
        return this;
    }

    public String Q() {
        return P(this.size, Ub.d.UTF_8);
    }

    @Override // Cc.g
    public boolean Q0(long byteCount) {
        return this.size >= byteCount;
    }

    @Override // Cc.g
    public long R0(h bytes) {
        C3862t.g(bytes, "bytes");
        return o(bytes, 0L);
    }

    @Override // Cc.f
    public long S(B source) {
        C3862t.g(source, "source");
        long j10 = 0;
        while (true) {
            long jI0 = source.I0(this, 8192L);
            if (jI0 == -1) {
                return j10;
            }
            j10 += jI0;
        }
    }

    @Override // Cc.f
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public C0982e K0(long v10) {
        if (v10 == 0) {
            return d0(48);
        }
        long j10 = (v10 >>> 1) | v10;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
        w wVarO0 = o0(i10);
        byte[] bArr = wVarO0.data;
        int i11 = wVarO0.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = Dc.a.b()[(int) (15 & v10)];
            v10 >>>= 4;
        }
        wVarO0.limit += i10;
        W(getSize() + i10);
        return this;
    }

    @Override // Cc.g
    public long V0(z sink) {
        C3862t.g(sink, "sink");
        long size = getSize();
        if (size > 0) {
            sink.n0(this, size);
        }
        return size;
    }

    public final void W(long j10) {
        this.size = j10;
    }

    /* renamed from: X, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // Cc.f
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C0982e U(int i10) {
        w wVarO0 = o0(4);
        byte[] bArr = wVarO0.data;
        int i11 = wVarO0.limit;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        wVarO0.limit = i11 + 4;
        W(getSize() + 4);
        return this;
    }

    @Override // Cc.g
    public String Y0() {
        return q0(Long.MAX_VALUE);
    }

    @Override // Cc.g
    public byte[] Z() {
        return b1(getSize());
    }

    @Override // Cc.g
    public int Z0() {
        return C0979b.g(readInt());
    }

    @Override // Cc.f
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C0982e b0(int i10) {
        return U(C0979b.g(i10));
    }

    public final void b() throws EOFException {
        w(getSize());
    }

    @Override // Cc.g
    public byte[] b1(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        C(bArr);
        return bArr;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0982e clone() {
        return f();
    }

    @Override // Cc.g
    public boolean c0() {
        return this.size == 0;
    }

    public final long d() {
        long size = getSize();
        if (size == 0) {
            return 0L;
        }
        w wVar = this.head;
        C3862t.d(wVar);
        w wVar2 = wVar.prev;
        C3862t.d(wVar2);
        if (wVar2.limit < 8192 && wVar2.owner) {
            size -= r3 - wVar2.pos;
        }
        return size;
    }

    public final h e0() {
        if (getSize() <= 2147483647L) {
            return i0((int) getSize());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + getSize()).toString());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof C0982e) {
            C0982e c0982e = (C0982e) other;
            if (getSize() == c0982e.getSize()) {
                if (getSize() == 0) {
                    return true;
                }
                w wVar = this.head;
                C3862t.d(wVar);
                w wVar2 = c0982e.head;
                C3862t.d(wVar2);
                int i10 = wVar.pos;
                int i11 = wVar2.pos;
                long j10 = 0;
                while (j10 < getSize()) {
                    long jMin = Math.min(wVar.limit - i10, wVar2.limit - i11);
                    long j11 = 0;
                    while (j11 < jMin) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (wVar.data[i10] == wVar2.data[i11]) {
                            j11++;
                            i10 = i12;
                            i11 = i13;
                        }
                    }
                    if (i10 == wVar.limit) {
                        wVar = wVar.next;
                        C3862t.d(wVar);
                        i10 = wVar.pos;
                    }
                    if (i11 == wVar2.limit) {
                        wVar2 = wVar2.next;
                        C3862t.d(wVar2);
                        i11 = wVar2.pos;
                    }
                    j10 += jMin;
                }
                return true;
            }
        }
        return false;
    }

    public final C0982e f() {
        C0982e c0982e = new C0982e();
        if (getSize() != 0) {
            w wVar = this.head;
            C3862t.d(wVar);
            w wVarD = wVar.d();
            c0982e.head = wVarD;
            wVarD.prev = wVarD;
            wVarD.next = wVarD;
            for (w wVar2 = wVar.next; wVar2 != wVar; wVar2 = wVar2.next) {
                w wVar3 = wVarD.prev;
                C3862t.d(wVar3);
                C3862t.d(wVar2);
                wVar3.c(wVar2.d());
            }
            c0982e.W(getSize());
        }
        return c0982e;
    }

    public final C0982e g(C0982e out, long offset, long byteCount) {
        C3862t.g(out, "out");
        C0979b.b(getSize(), offset, byteCount);
        if (byteCount != 0) {
            out.W(out.getSize() + byteCount);
            w wVar = this.head;
            while (true) {
                C3862t.d(wVar);
                int i10 = wVar.limit;
                int i11 = wVar.pos;
                if (offset < i10 - i11) {
                    break;
                }
                offset -= i10 - i11;
                wVar = wVar.next;
            }
            while (byteCount > 0) {
                C3862t.d(wVar);
                w wVarD = wVar.d();
                int i12 = wVarD.pos + ((int) offset);
                wVarD.pos = i12;
                wVarD.limit = Math.min(i12 + ((int) byteCount), wVarD.limit);
                w wVar2 = out.head;
                if (wVar2 == null) {
                    wVarD.prev = wVarD;
                    wVarD.next = wVarD;
                    out.head = wVarD;
                } else {
                    C3862t.d(wVar2);
                    w wVar3 = wVar2.prev;
                    C3862t.d(wVar3);
                    wVar3.c(wVarD);
                }
                byteCount -= wVarD.limit - wVarD.pos;
                wVar = wVar.next;
                offset = 0;
            }
        }
        return this;
    }

    public C0982e g1(long v10) {
        w wVarO0 = o0(8);
        byte[] bArr = wVarO0.data;
        int i10 = wVarO0.limit;
        bArr[i10] = (byte) ((v10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((v10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((v10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((v10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((v10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((v10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((v10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (v10 & 255);
        wVarO0.limit = i10 + 8;
        W(getSize() + 8);
        return this;
    }

    @Override // Cc.f
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public C0982e V(long v10) {
        return g1(C0979b.h(v10));
    }

    public int hashCode() {
        w wVar = this.head;
        if (wVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = wVar.limit;
            for (int i12 = wVar.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + wVar.data[i12];
            }
            wVar = wVar.next;
            C3862t.d(wVar);
        } while (wVar != this.head);
        return i10;
    }

    public final h i0(int byteCount) {
        if (byteCount == 0) {
            return h.f3238F;
        }
        C0979b.b(getSize(), 0L, byteCount);
        w wVar = this.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < byteCount) {
            C3862t.d(wVar);
            int i13 = wVar.limit;
            int i14 = wVar.pos;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            wVar = wVar.next;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        w wVar2 = this.head;
        int i15 = 0;
        while (i10 < byteCount) {
            C3862t.d(wVar2);
            bArr[i15] = wVar2.data;
            i10 += wVar2.limit - wVar2.pos;
            iArr[i15] = Math.min(i10, byteCount);
            iArr[i15 + i12] = wVar2.pos;
            wVar2.shared = true;
            i15++;
            wVar2 = wVar2.next;
        }
        return new y(bArr, iArr);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // Cc.g
    public long j1(h targetBytes) {
        C3862t.g(targetBytes, "targetBytes");
        return p(targetBytes, 0L);
    }

    @Override // Cc.f
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public C0982e O(int s10) {
        w wVarO0 = o0(2);
        byte[] bArr = wVarO0.data;
        int i10 = wVarO0.limit;
        bArr[i10] = (byte) ((s10 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (s10 & 255);
        wVarO0.limit = i10 + 2;
        W(getSize() + 2);
        return this;
    }

    public final byte m(long pos) {
        C0979b.b(getSize(), pos, 1L);
        w wVar = this.head;
        if (wVar == null) {
            C3862t.d(null);
            throw null;
        }
        if (getSize() - pos < pos) {
            long size = getSize();
            while (size > pos) {
                wVar = wVar.prev;
                C3862t.d(wVar);
                size -= wVar.limit - wVar.pos;
            }
            C3862t.d(wVar);
            return wVar.data[(int) ((wVar.pos + pos) - size)];
        }
        long j10 = 0;
        while (true) {
            long j11 = (wVar.limit - wVar.pos) + j10;
            if (j11 > pos) {
                C3862t.d(wVar);
                return wVar.data[(int) ((wVar.pos + pos) - j10)];
            }
            wVar = wVar.next;
            C3862t.d(wVar);
            j10 = j11;
        }
    }

    @Override // Cc.g
    public long m0() throws EOFException {
        if (getSize() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j10 = 0;
        long j11 = -7;
        boolean z11 = false;
        do {
            w wVar = this.head;
            C3862t.d(wVar);
            byte[] bArr = wVar.data;
            int i11 = wVar.pos;
            int i12 = wVar.limit;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j10 < -922337203685477580L || (j10 == -922337203685477580L && i13 < j11)) {
                        C0982e c0982eD0 = new C0982e().v1(j10).d0(b10);
                        if (!z10) {
                            c0982eD0.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + c0982eD0.Q());
                    }
                    j10 = (j10 * 10) + i13;
                } else {
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j11--;
                    z10 = true;
                }
                i11++;
                i10++;
            }
            if (i11 == i12) {
                this.head = wVar.b();
                x.b(wVar);
            } else {
                wVar.pos = i11;
            }
            if (z11) {
                break;
            }
        } while (this.head != null);
        W(getSize() - i10);
        if (i10 >= (z10 ? 2 : 1)) {
            return z10 ? j10 : -j10;
        }
        if (getSize() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + C0979b.j(m(0L)));
    }

    @Override // Cc.g
    public long m1() {
        return C0979b.h(L());
    }

    public long n(byte b10, long fromIndex, long toIndex) {
        w wVar;
        int i10;
        long size = 0;
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("size=" + getSize() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > getSize()) {
            toIndex = getSize();
        }
        if (fromIndex == toIndex || (wVar = this.head) == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                wVar = wVar.prev;
                C3862t.d(wVar);
                size -= wVar.limit - wVar.pos;
            }
            while (size < toIndex) {
                byte[] bArr = wVar.data;
                int iMin = (int) Math.min(wVar.limit, (wVar.pos + toIndex) - size);
                i10 = (int) ((wVar.pos + fromIndex) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += wVar.limit - wVar.pos;
                wVar = wVar.next;
                C3862t.d(wVar);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j10 = (wVar.limit - wVar.pos) + size;
            if (j10 > fromIndex) {
                break;
            }
            wVar = wVar.next;
            C3862t.d(wVar);
            size = j10;
        }
        while (size < toIndex) {
            byte[] bArr2 = wVar.data;
            int iMin2 = (int) Math.min(wVar.limit, (wVar.pos + toIndex) - size);
            i10 = (int) ((wVar.pos + fromIndex) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += wVar.limit - wVar.pos;
            wVar = wVar.next;
            C3862t.d(wVar);
            fromIndex = size;
        }
        return -1L;
        return (i10 - wVar.pos) + size;
    }

    @Override // Cc.z
    public void n0(C0982e source, long byteCount) {
        w wVar;
        C3862t.g(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        C0979b.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            w wVar2 = source.head;
            C3862t.d(wVar2);
            int i10 = wVar2.limit;
            C3862t.d(source.head);
            if (byteCount < i10 - r1.pos) {
                w wVar3 = this.head;
                if (wVar3 != null) {
                    C3862t.d(wVar3);
                    wVar = wVar3.prev;
                } else {
                    wVar = null;
                }
                if (wVar != null && wVar.owner) {
                    if ((wVar.limit + byteCount) - (wVar.shared ? 0 : wVar.pos) <= 8192) {
                        w wVar4 = source.head;
                        C3862t.d(wVar4);
                        wVar4.f(wVar, (int) byteCount);
                        source.W(source.getSize() - byteCount);
                        W(getSize() + byteCount);
                        return;
                    }
                }
                w wVar5 = source.head;
                C3862t.d(wVar5);
                source.head = wVar5.e((int) byteCount);
            }
            w wVar6 = source.head;
            C3862t.d(wVar6);
            long j10 = wVar6.limit - wVar6.pos;
            source.head = wVar6.b();
            w wVar7 = this.head;
            if (wVar7 == null) {
                this.head = wVar6;
                wVar6.prev = wVar6;
                wVar6.next = wVar6;
            } else {
                C3862t.d(wVar7);
                w wVar8 = wVar7.prev;
                C3862t.d(wVar8);
                wVar8.c(wVar6).a();
            }
            source.W(source.getSize() - j10);
            W(getSize() + j10);
            byteCount -= j10;
        }
    }

    public C0982e n1(String string, int beginIndex, int endIndex, Charset charset) {
        C3862t.g(string, "string");
        C3862t.g(charset, "charset");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        if (C3862t.b(charset, Ub.d.UTF_8)) {
            return J0(string, beginIndex, endIndex);
        }
        String strSubstring = string.substring(beginIndex, endIndex);
        C3862t.f(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        C3862t.f(bytes, "getBytes(...)");
        return v(bytes, 0, bytes.length);
    }

    public long o(h bytes, long fromIndex) {
        int i10;
        long j10 = fromIndex;
        C3862t.g(bytes, "bytes");
        if (bytes.J() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        w wVar = this.head;
        if (wVar != null) {
            if (getSize() - j10 < j10) {
                size = getSize();
                while (size > j10) {
                    wVar = wVar.prev;
                    C3862t.d(wVar);
                    size -= wVar.limit - wVar.pos;
                }
                byte[] bArrZ = bytes.z();
                byte b10 = bArrZ[0];
                int iJ = bytes.J();
                long size2 = (getSize() - iJ) + 1;
                while (size < size2) {
                    byte[] bArr = wVar.data;
                    long j11 = size2;
                    int iMin = (int) Math.min(wVar.limit, (wVar.pos + size2) - size);
                    i10 = (int) ((wVar.pos + j10) - size);
                    while (i10 < iMin) {
                        if (bArr[i10] == b10 && Dc.a.c(wVar, i10 + 1, bArrZ, 1, iJ)) {
                            return (i10 - wVar.pos) + size;
                        }
                        i10++;
                    }
                    size += wVar.limit - wVar.pos;
                    wVar = wVar.next;
                    C3862t.d(wVar);
                    j10 = size;
                    size2 = j11;
                }
            } else {
                while (true) {
                    long j12 = (wVar.limit - wVar.pos) + size;
                    if (j12 > j10) {
                        break;
                    }
                    wVar = wVar.next;
                    C3862t.d(wVar);
                    size = j12;
                }
                byte[] bArrZ2 = bytes.z();
                byte b11 = bArrZ2[0];
                int iJ2 = bytes.J();
                long size3 = (getSize() - iJ2) + 1;
                while (size < size3) {
                    byte[] bArr2 = wVar.data;
                    int iMin2 = (int) Math.min(wVar.limit, (wVar.pos + size3) - size);
                    i10 = (int) ((wVar.pos + j10) - size);
                    while (i10 < iMin2) {
                        if (bArr2[i10] == b11 && Dc.a.c(wVar, i10 + 1, bArrZ2, 1, iJ2)) {
                            return (i10 - wVar.pos) + size;
                        }
                        i10++;
                    }
                    size += wVar.limit - wVar.pos;
                    wVar = wVar.next;
                    C3862t.d(wVar);
                    j10 = size;
                }
            }
        }
        return -1L;
    }

    public final w o0(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        w wVar = this.head;
        if (wVar != null) {
            C3862t.d(wVar);
            w wVar2 = wVar.prev;
            C3862t.d(wVar2);
            return (wVar2.limit + minimumCapacity > 8192 || !wVar2.owner) ? wVar2.c(x.c()) : wVar2;
        }
        w wVarC = x.c();
        this.head = wVarC;
        wVarC.prev = wVarC;
        wVarC.next = wVarC;
        return wVarC;
    }

    @Override // Cc.g
    public g o1() {
        return o.d(new t(this));
    }

    public long p(h targetBytes, long fromIndex) {
        int i10;
        int i11;
        C3862t.g(targetBytes, "targetBytes");
        long size = 0;
        if (fromIndex < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + fromIndex).toString());
        }
        w wVar = this.head;
        if (wVar == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                wVar = wVar.prev;
                C3862t.d(wVar);
                size -= wVar.limit - wVar.pos;
            }
            if (targetBytes.J() == 2) {
                byte bT = targetBytes.t(0);
                byte bT2 = targetBytes.t(1);
                while (size < getSize()) {
                    byte[] bArr = wVar.data;
                    i10 = (int) ((wVar.pos + fromIndex) - size);
                    int i12 = wVar.limit;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 == bT || b10 == bT2) {
                            i11 = wVar.pos;
                        } else {
                            i10++;
                        }
                    }
                    size += wVar.limit - wVar.pos;
                    wVar = wVar.next;
                    C3862t.d(wVar);
                    fromIndex = size;
                }
                return -1L;
            }
            byte[] bArrZ = targetBytes.z();
            while (size < getSize()) {
                byte[] bArr2 = wVar.data;
                i10 = (int) ((wVar.pos + fromIndex) - size);
                int i13 = wVar.limit;
                while (i10 < i13) {
                    byte b11 = bArr2[i10];
                    for (byte b12 : bArrZ) {
                        if (b11 == b12) {
                            i11 = wVar.pos;
                        }
                    }
                    i10++;
                }
                size += wVar.limit - wVar.pos;
                wVar = wVar.next;
                C3862t.d(wVar);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j10 = (wVar.limit - wVar.pos) + size;
            if (j10 > fromIndex) {
                break;
            }
            wVar = wVar.next;
            C3862t.d(wVar);
            size = j10;
        }
        if (targetBytes.J() == 2) {
            byte bT3 = targetBytes.t(0);
            byte bT4 = targetBytes.t(1);
            while (size < getSize()) {
                byte[] bArr3 = wVar.data;
                i10 = (int) ((wVar.pos + fromIndex) - size);
                int i14 = wVar.limit;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 == bT3 || b13 == bT4) {
                        i11 = wVar.pos;
                    } else {
                        i10++;
                    }
                }
                size += wVar.limit - wVar.pos;
                wVar = wVar.next;
                C3862t.d(wVar);
                fromIndex = size;
            }
            return -1L;
        }
        byte[] bArrZ2 = targetBytes.z();
        while (size < getSize()) {
            byte[] bArr4 = wVar.data;
            i10 = (int) ((wVar.pos + fromIndex) - size);
            int i15 = wVar.limit;
            while (i10 < i15) {
                byte b14 = bArr4[i10];
                for (byte b15 : bArrZ2) {
                    if (b14 == b15) {
                        i11 = wVar.pos;
                    }
                }
                i10++;
            }
            size += wVar.limit - wVar.pos;
            wVar = wVar.next;
            C3862t.d(wVar);
            fromIndex = size;
        }
        return -1L;
        return (i10 - i11) + size;
    }

    @Override // Cc.f
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C0982e t0(h byteString) {
        C3862t.g(byteString, "byteString");
        byteString.O(this, 0, byteString.J());
        return this;
    }

    public OutputStream q() {
        return new c();
    }

    @Override // Cc.g
    public String q0(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j10 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long jN = n((byte) 10, 0L, j10);
        if (jN != -1) {
            return Dc.a.d(this, jN);
        }
        if (j10 < getSize() && m(j10 - 1) == 13 && m(j10) == 10) {
            return Dc.a.d(this, j10);
        }
        C0982e c0982e = new C0982e();
        g(c0982e, 0L, Math.min(32, getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(getSize(), limit) + " content=" + c0982e.u().y() + (char) 8230);
    }

    @Override // Cc.f
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public C0982e A0(String string) {
        C3862t.g(string, "string");
        return J0(string, 0, string.length());
    }

    @Override // Cc.B
    public C r() {
        return C.f3205e;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        C3862t.g(sink, "sink");
        w wVar = this.head;
        if (wVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), wVar.limit - wVar.pos);
        sink.put(wVar.data, wVar.pos, iMin);
        int i10 = wVar.pos + iMin;
        wVar.pos = i10;
        this.size -= iMin;
        if (i10 == wVar.limit) {
            this.head = wVar.b();
            x.b(wVar);
        }
        return iMin;
    }

    @Override // Cc.g
    public byte readByte() throws EOFException {
        if (getSize() == 0) {
            throw new EOFException();
        }
        w wVar = this.head;
        C3862t.d(wVar);
        int i10 = wVar.pos;
        int i11 = wVar.limit;
        int i12 = i10 + 1;
        byte b10 = wVar.data[i10];
        W(getSize() - 1);
        if (i12 == i11) {
            this.head = wVar.b();
            x.b(wVar);
        } else {
            wVar.pos = i12;
        }
        return b10;
    }

    @Override // Cc.g
    public int readInt() throws EOFException {
        if (getSize() < 4) {
            throw new EOFException();
        }
        w wVar = this.head;
        C3862t.d(wVar);
        int i10 = wVar.pos;
        int i11 = wVar.limit;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = wVar.data;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        W(getSize() - 4);
        if (i14 == i11) {
            this.head = wVar.b();
            x.b(wVar);
        } else {
            wVar.pos = i14;
        }
        return i15;
    }

    @Override // Cc.g
    public short readShort() throws EOFException {
        if (getSize() < 2) {
            throw new EOFException();
        }
        w wVar = this.head;
        C3862t.d(wVar);
        int i10 = wVar.pos;
        int i11 = wVar.limit;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = wVar.data;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        W(getSize() - 2);
        if (i14 == i11) {
            this.head = wVar.b();
            x.b(wVar);
        } else {
            wVar.pos = i14;
        }
        return (short) i15;
    }

    public int s(byte[] sink, int offset, int byteCount) {
        C3862t.g(sink, "sink");
        C0979b.b(sink.length, offset, byteCount);
        w wVar = this.head;
        if (wVar == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, wVar.limit - wVar.pos);
        byte[] bArr = wVar.data;
        int i10 = wVar.pos;
        C3831l.h(bArr, sink, offset, i10, i10 + iMin);
        wVar.pos += iMin;
        W(getSize() - iMin);
        if (wVar.pos == wVar.limit) {
            this.head = wVar.b();
            x.b(wVar);
        }
        return iMin;
    }

    @Override // Cc.f
    /* renamed from: s1, reason: merged with bridge method [inline-methods] */
    public C0982e J0(String string, int beginIndex, int endIndex) {
        char cCharAt;
        C3862t.g(string, "string");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        while (beginIndex < endIndex) {
            char cCharAt2 = string.charAt(beginIndex);
            if (cCharAt2 < 128) {
                w wVarO0 = o0(1);
                byte[] bArr = wVarO0.data;
                int i10 = wVarO0.limit - beginIndex;
                int iMin = Math.min(endIndex, 8192 - i10);
                int i11 = beginIndex + 1;
                bArr[beginIndex + i10] = (byte) cCharAt2;
                while (true) {
                    beginIndex = i11;
                    if (beginIndex >= iMin || (cCharAt = string.charAt(beginIndex)) >= 128) {
                        break;
                    }
                    i11 = beginIndex + 1;
                    bArr[beginIndex + i10] = (byte) cCharAt;
                }
                int i12 = wVarO0.limit;
                int i13 = (i10 + beginIndex) - i12;
                wVarO0.limit = i12 + i13;
                W(getSize() + i13);
            } else {
                if (cCharAt2 < 2048) {
                    w wVarO02 = o0(2);
                    byte[] bArr2 = wVarO02.data;
                    int i14 = wVarO02.limit;
                    bArr2[i14] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i14 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    wVarO02.limit = i14 + 2;
                    W(getSize() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    w wVarO03 = o0(3);
                    byte[] bArr3 = wVarO03.data;
                    int i15 = wVarO03.limit;
                    bArr3[i15] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i15 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    wVarO03.limit = i15 + 3;
                    W(getSize() + 3);
                } else {
                    int i16 = beginIndex + 1;
                    char cCharAt3 = i16 < endIndex ? string.charAt(i16) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        d0(63);
                        beginIndex = i16;
                    } else {
                        int i17 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        w wVarO04 = o0(4);
                        byte[] bArr4 = wVarO04.data;
                        int i18 = wVarO04.limit;
                        bArr4[i18] = (byte) ((i17 >> 18) | 240);
                        bArr4[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                        bArr4[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                        bArr4[i18 + 3] = (byte) ((i17 & 63) | 128);
                        wVarO04.limit = i18 + 4;
                        W(getSize() + 4);
                        beginIndex += 2;
                    }
                }
                beginIndex++;
            }
        }
        return this;
    }

    public final a t(a unsafeCursor) {
        C3862t.g(unsafeCursor, "unsafeCursor");
        return Dc.a.a(this, unsafeCursor);
    }

    @Override // Cc.g
    public void t1(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    public String toString() {
        return e0().toString();
    }

    public h u() {
        return H(getSize());
    }

    public C0982e u1(int codePoint) {
        if (codePoint < 128) {
            d0(codePoint);
        } else if (codePoint < 2048) {
            w wVarO0 = o0(2);
            byte[] bArr = wVarO0.data;
            int i10 = wVarO0.limit;
            bArr[i10] = (byte) ((codePoint >> 6) | 192);
            bArr[i10 + 1] = (byte) ((codePoint & 63) | 128);
            wVarO0.limit = i10 + 2;
            W(getSize() + 2);
        } else if (55296 <= codePoint && codePoint < 57344) {
            d0(63);
        } else if (codePoint < 65536) {
            w wVarO02 = o0(3);
            byte[] bArr2 = wVarO02.data;
            int i11 = wVarO02.limit;
            bArr2[i11] = (byte) ((codePoint >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((codePoint & 63) | 128);
            wVarO02.limit = i11 + 3;
            W(getSize() + 3);
        } else {
            if (codePoint > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + C0979b.k(codePoint));
            }
            w wVarO03 = o0(4);
            byte[] bArr3 = wVarO03.data;
            int i12 = wVarO03.limit;
            bArr3[i12] = (byte) ((codePoint >> 18) | 240);
            bArr3[i12 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
            bArr3[i12 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr3[i12 + 3] = (byte) ((codePoint & 63) | 128);
            wVarO03.limit = i12 + 4;
            W(getSize() + 4);
        }
        return this;
    }

    @Override // Cc.g
    public void w(long byteCount) throws EOFException {
        while (byteCount > 0) {
            w wVar = this.head;
            if (wVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(byteCount, wVar.limit - wVar.pos);
            long j10 = iMin;
            W(getSize() - j10);
            byteCount -= j10;
            int i10 = wVar.pos + iMin;
            wVar.pos = i10;
            if (i10 == wVar.limit) {
                this.head = wVar.b();
                x.b(wVar);
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        C3862t.g(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            w wVarO0 = o0(1);
            int iMin = Math.min(i10, 8192 - wVarO0.limit);
            source.get(wVarO0.data, wVarO0.limit, iMin);
            i10 -= iMin;
            wVarO0.limit += iMin;
        }
        this.size += iRemaining;
        return iRemaining;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7 A[EDGE_INSN: B:43:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // Cc.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long x1() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.getSize()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb1
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            Cc.w r6 = r14.head
            kotlin.jvm.internal.C3862t.d(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            Cc.e r0 = new Cc.e
            r0.<init>()
            Cc.e r0 = r0.K0(r4)
            Cc.e r0 = r0.d0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.Q()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = Cc.C0979b.j(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r8 != r9) goto L9f
            Cc.w r7 = r6.b()
            r14.head = r7
            Cc.x.b(r6)
            goto La1
        L9f:
            r6.pos = r8
        La1:
            if (r1 != 0) goto La7
            Cc.w r6 = r14.head
            if (r6 != 0) goto Ld
        La7:
            long r1 = r14.getSize()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.W(r1)
            return r4
        Lb1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Cc.C0982e.x1():long");
    }

    @Override // Cc.g
    public int y1(r options) throws EOFException {
        C3862t.g(options, "options");
        int iF = Dc.a.f(this, options, false, 2, null);
        if (iF == -1) {
            return -1;
        }
        w(options.getByteStrings()[iF].J());
        return iF;
    }

    /* compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Cc/e$b", "Ljava/io/InputStream;", "", "read", "()I", "", "sink", "offset", "byteCount", "([BII)I", "available", "Loa/F;", "close", "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cc.e$b */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C0982e.this.getSize(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C0982e.this.getSize() > 0) {
                return C0982e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C0982e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int offset, int byteCount) {
            C3862t.g(sink, "sink");
            return C0982e.this.s(sink, offset, byteCount);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // Cc.g
    public C0982e G() {
        return this;
    }

    @Override // Cc.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // Cc.f, Cc.z, java.io.Flushable
    public void flush() {
    }

    @Override // Cc.g, Cc.f
    public C0982e i() {
        return this;
    }

    @Override // Cc.f
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0982e M() {
        return this;
    }

    @Override // Cc.f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0982e k0() {
        return this;
    }
}
