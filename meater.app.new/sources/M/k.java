package M;

import com.apptionlabs.meater_app.data.Temperature;
import i0.C3606v0;
import kotlin.Metadata;

/* compiled from: PaletteTokens.kt */
@Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\bï\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001d\u0010\u0014\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u001c\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u001d\u0010\u001f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001d\u0010\"\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\bR\u001d\u0010%\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001d\u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001d\u0010*\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u001d\u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001d\u0010/\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u00101\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u00103\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u001d\u00106\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u001d\u00109\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u001d\u0010;\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010>\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\bR\u001d\u0010A\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u001d\u0010D\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\bR\u001d\u0010G\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u001d\u0010J\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\bI\u0010\bR\u001d\u0010M\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u001d\u0010P\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\bR\u001d\u0010S\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u001d\u0010V\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\bU\u0010\bR\u001d\u0010Y\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u001d\u0010[\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bZ\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001d\u0010]\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\\\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u001d\u0010_\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\b \u0010\bR\u001d\u0010a\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b`\u0010\u0006\u001a\u0004\b#\u0010\bR\u001d\u0010b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0006\u001a\u0004\b&\u0010\bR\u001d\u0010d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\b(\u0010\bR\u001d\u0010f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\b+\u0010\bR\u001d\u0010i\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u001d\u0010l\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bk\u0010\bR\u001d\u0010o\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\bR\u001d\u0010r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bp\u0010\u0006\u001a\u0004\bq\u0010\bR\u001d\u0010u\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bs\u0010\u0006\u001a\u0004\bt\u0010\bR\u001d\u0010w\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bv\u0010\u0006\u001a\u0004\b.\u0010\bR\u001d\u0010z\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bx\u0010\u0006\u001a\u0004\by\u0010\bR\u001d\u0010|\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b0\u0010\bR\u001d\u0010\u007f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b}\u0010\u0006\u001a\u0004\b~\u0010\bR \u0010\u0082\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0006\u001a\u0005\b\u0081\u0001\u0010\bR\u001f\u0010\u0084\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u0083\u0001\u0010\u0006\u001a\u0004\b2\u0010\bR\u001f\u0010\u0086\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0004\b4\u0010\bR \u0010\u0089\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0005\b\u0088\u0001\u0010\bR \u0010\u008c\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0006\u001a\u0005\b\u008b\u0001\u0010\bR \u0010\u008f\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0006\u001a\u0005\b\u008e\u0001\u0010\bR\u001f\u0010\u0091\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u0090\u0001\u0010\u0006\u001a\u0004\b7\u0010\bR\u001f\u0010\u0093\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u0092\u0001\u0010\u0006\u001a\u0004\b:\u0010\bR \u0010\u0096\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0006\u001a\u0005\b\u0095\u0001\u0010\bR\u001f\u0010\u0098\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u0097\u0001\u0010\u0006\u001a\u0004\b<\u0010\bR\u001f\u0010\u009a\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u0099\u0001\u0010\u0006\u001a\u0004\b?\u0010\bR \u0010\u009d\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0006\u001a\u0005\b\u009c\u0001\u0010\bR \u0010 \u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010\u0006\u001a\u0005\b\u009f\u0001\u0010\bR \u0010£\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0006\u001a\u0005\b¢\u0001\u0010\bR\u001f\u0010¥\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b¤\u0001\u0010\u0006\u001a\u0004\bB\u0010\bR\u001f\u0010§\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b¦\u0001\u0010\u0006\u001a\u0004\bE\u0010\bR \u0010ª\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¨\u0001\u0010\u0006\u001a\u0005\b©\u0001\u0010\bR \u0010\u00ad\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b«\u0001\u0010\u0006\u001a\u0005\b¬\u0001\u0010\bR \u0010°\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b®\u0001\u0010\u0006\u001a\u0005\b¯\u0001\u0010\bR\u001f\u0010²\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b±\u0001\u0010\u0006\u001a\u0004\bH\u0010\bR\u001f\u0010´\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b³\u0001\u0010\u0006\u001a\u0004\bK\u0010\bR \u0010·\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0006\u001a\u0005\b¶\u0001\u0010\bR\u001f\u0010¹\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b¸\u0001\u0010\u0006\u001a\u0004\bN\u0010\bR\u001f\u0010»\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\bº\u0001\u0010\u0006\u001a\u0004\bQ\u0010\bR \u0010¾\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¼\u0001\u0010\u0006\u001a\u0005\b½\u0001\u0010\bR \u0010Á\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u0006\u001a\u0005\bÀ\u0001\u0010\bR \u0010Ä\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÂ\u0001\u0010\u0006\u001a\u0005\bÃ\u0001\u0010\bR\u001f\u0010Æ\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\bÅ\u0001\u0010\u0006\u001a\u0004\bT\u0010\bR\u001f\u0010È\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\bÇ\u0001\u0010\u0006\u001a\u0004\bW\u0010\bR \u0010Ë\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÉ\u0001\u0010\u0006\u001a\u0005\bÊ\u0001\u0010\bR \u0010Î\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÌ\u0001\u0010\u0006\u001a\u0005\bÍ\u0001\u0010\bR \u0010Ñ\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÏ\u0001\u0010\u0006\u001a\u0005\bÐ\u0001\u0010\bR\u001f\u0010Ó\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\bÒ\u0001\u0010\u0006\u001a\u0004\bZ\u0010\bR\u001f\u0010Õ\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\bÔ\u0001\u0010\u0006\u001a\u0004\b\\\u0010\bR \u0010Ø\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÖ\u0001\u0010\u0006\u001a\u0005\b×\u0001\u0010\bR\u001f\u0010Ú\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\bÙ\u0001\u0010\u0006\u001a\u0004\b^\u0010\bR\u001f\u0010Ü\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\bÛ\u0001\u0010\u0006\u001a\u0004\b`\u0010\bR \u0010ß\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÝ\u0001\u0010\u0006\u001a\u0005\bÞ\u0001\u0010\bR \u0010â\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bà\u0001\u0010\u0006\u001a\u0005\bá\u0001\u0010\bR \u0010å\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bã\u0001\u0010\u0006\u001a\u0005\bä\u0001\u0010\bR\u001f\u0010ç\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\bæ\u0001\u0010\u0006\u001a\u0004\b\u0006\u0010\bR\u001f\u0010é\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\bè\u0001\u0010\u0006\u001a\u0004\bc\u0010\bR \u0010ì\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bê\u0001\u0010\u0006\u001a\u0005\bë\u0001\u0010\bR \u0010ï\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bí\u0001\u0010\u0006\u001a\u0005\bî\u0001\u0010\bR \u0010ò\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bð\u0001\u0010\u0006\u001a\u0005\bñ\u0001\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ó\u0001"}, d2 = {"LM/k;", "", "<init>", "()V", "Li0/t0;", "b", "J", "getBlack-0d7_KjU", "()J", "Black", "c", "getError0-0d7_KjU", "Error0", "d", "a", "Error10", "e", "Error100", "f", "getError20-0d7_KjU", "Error20", "g", "getError30-0d7_KjU", "Error30", "h", "Error40", "i", "getError50-0d7_KjU", "Error50", "j", "getError60-0d7_KjU", "Error60", "k", "getError70-0d7_KjU", "Error70", "l", "getError80-0d7_KjU", "Error80", "m", "Error90", "n", "getError95-0d7_KjU", "Error95", "o", "getError99-0d7_KjU", "Error99", "p", "Neutral0", "q", "Neutral10", "r", "Neutral100", "s", "getNeutral12-0d7_KjU", "Neutral12", "t", "getNeutral17-0d7_KjU", "Neutral17", "u", "Neutral20", "v", "getNeutral22-0d7_KjU", "Neutral22", "w", "getNeutral24-0d7_KjU", "Neutral24", "x", "getNeutral30-0d7_KjU", "Neutral30", "y", "getNeutral4-0d7_KjU", "Neutral4", "z", "getNeutral40-0d7_KjU", "Neutral40", "A", "getNeutral50-0d7_KjU", "Neutral50", "B", "getNeutral6-0d7_KjU", "Neutral6", "C", "getNeutral60-0d7_KjU", "Neutral60", "D", "getNeutral70-0d7_KjU", "Neutral70", "E", "getNeutral80-0d7_KjU", "Neutral80", "F", "Neutral87", "G", "Neutral90", "H", "Neutral92", "I", "Neutral94", "Neutral95", "K", "Neutral96", "L", "Neutral98", "M", "getNeutral99-0d7_KjU", "Neutral99", "N", "getNeutralVariant0-0d7_KjU", "NeutralVariant0", "O", "getNeutralVariant10-0d7_KjU", "NeutralVariant10", "P", "getNeutralVariant100-0d7_KjU", "NeutralVariant100", "Q", "getNeutralVariant20-0d7_KjU", "NeutralVariant20", "R", "NeutralVariant30", "S", "getNeutralVariant40-0d7_KjU", "NeutralVariant40", "T", "NeutralVariant50", "U", "getNeutralVariant60-0d7_KjU", "NeutralVariant60", "V", "getNeutralVariant70-0d7_KjU", "NeutralVariant70", "W", "NeutralVariant80", "X", "NeutralVariant90", "Y", "getNeutralVariant95-0d7_KjU", "NeutralVariant95", "Z", "getNeutralVariant99-0d7_KjU", "NeutralVariant99", "a0", "getPrimary0-0d7_KjU", "Primary0", "b0", "Primary10", "c0", "Primary100", "d0", "getPrimary20-0d7_KjU", "Primary20", "e0", "Primary30", "f0", "Primary40", "g0", "getPrimary50-0d7_KjU", "Primary50", "h0", "getPrimary60-0d7_KjU", "Primary60", "i0", "getPrimary70-0d7_KjU", "Primary70", "j0", "Primary80", "k0", "Primary90", "l0", "getPrimary95-0d7_KjU", "Primary95", "m0", "getPrimary99-0d7_KjU", "Primary99", "n0", "getSecondary0-0d7_KjU", "Secondary0", "o0", "Secondary10", "p0", "Secondary100", "q0", "getSecondary20-0d7_KjU", "Secondary20", "r0", "Secondary30", "s0", "Secondary40", "t0", "getSecondary50-0d7_KjU", "Secondary50", "u0", "getSecondary60-0d7_KjU", "Secondary60", "v0", "getSecondary70-0d7_KjU", "Secondary70", "w0", "Secondary80", "x0", "Secondary90", "y0", "getSecondary95-0d7_KjU", "Secondary95", "z0", "getSecondary99-0d7_KjU", "Secondary99", "A0", "getTertiary0-0d7_KjU", "Tertiary0", "B0", "Tertiary10", "C0", "Tertiary100", "D0", "getTertiary20-0d7_KjU", "Tertiary20", "E0", "Tertiary30", "F0", "Tertiary40", "G0", "getTertiary50-0d7_KjU", "Tertiary50", "H0", "getTertiary60-0d7_KjU", "Tertiary60", "I0", "getTertiary70-0d7_KjU", "Tertiary70", "J0", "Tertiary80", "K0", "Tertiary90", "L0", "getTertiary95-0d7_KjU", "Tertiary95", "M0", "getTertiary99-0d7_KjU", "Tertiary99", "N0", "getWhite-0d7_KjU", "White", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f11599a = new k();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long Black = C3606v0.e(0, 0, 0, 0, 8, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long Error0 = C3606v0.e(0, 0, 0, 0, 8, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final long Error10 = C3606v0.e(65, 14, 11, 0, 8, null);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final long Error100 = C3606v0.e(255, 255, 255, 0, 8, null);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final long Error20 = C3606v0.e(96, 20, 16, 0, 8, null);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final long Error30 = C3606v0.e(140, 29, 24, 0, 8, null);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final long Error40 = C3606v0.e(179, 38, 30, 0, 8, null);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final long Error50 = C3606v0.e(220, 54, 46, 0, 8, null);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final long Error60 = C3606v0.e(228, Temperature.MAX_INTERNAL_SECOND_GEN_PROBE, 98, 0, 8, null);

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final long Error70 = C3606v0.e(236, 146, 142, 0, 8, null);

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final long Error80 = C3606v0.e(242, 184, 181, 0, 8, null);

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final long Error90 = C3606v0.e(249, 222, 220, 0, 8, null);

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final long Error95 = C3606v0.e(252, 238, 238, 0, 8, null);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final long Error99 = C3606v0.e(255, 251, 249, 0, 8, null);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral0 = C3606v0.e(0, 0, 0, 0, 8, null);

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral10 = C3606v0.e(29, 27, 32, 0, 8, null);

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral100 = C3606v0.e(255, 255, 255, 0, 8, null);

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral12 = C3606v0.e(33, 31, 38, 0, 8, null);

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral17 = C3606v0.e(43, 41, 48, 0, 8, null);

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral20 = C3606v0.e(50, 47, 53, 0, 8, null);

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral22 = C3606v0.e(54, 52, 59, 0, 8, null);

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral24 = C3606v0.e(59, 56, 62, 0, 8, null);

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral30 = C3606v0.e(72, 70, 76, 0, 8, null);

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral4 = C3606v0.e(15, 13, 19, 0, 8, null);

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral40 = C3606v0.e(96, 93, 100, 0, 8, null);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral50 = C3606v0.e(121, 118, 125, 0, 8, null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral6 = C3606v0.e(20, 18, 24, 0, 8, null);

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral60 = C3606v0.e(147, 143, 150, 0, 8, null);

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral70 = C3606v0.e(174, 169, 177, 0, 8, null);

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral80 = C3606v0.e(202, 197, 205, 0, 8, null);

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral87 = C3606v0.e(222, 216, 225, 0, 8, null);

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral90 = C3606v0.e(230, 224, 233, 0, 8, null);

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral92 = C3606v0.e(236, 230, 240, 0, 8, null);

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral94 = C3606v0.e(243, 237, 247, 0, 8, null);

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral95 = C3606v0.e(245, 239, 247, 0, 8, null);

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral96 = C3606v0.e(247, 242, 250, 0, 8, null);

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral98 = C3606v0.e(254, 247, 255, 0, 8, null);

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral99 = C3606v0.e(255, 251, 255, 0, 8, null);

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant0 = C3606v0.e(0, 0, 0, 0, 8, null);

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant10 = C3606v0.e(29, 26, 34, 0, 8, null);

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant100 = C3606v0.e(255, 255, 255, 0, 8, null);

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant20 = C3606v0.e(50, 47, 55, 0, 8, null);

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant30 = C3606v0.e(73, 69, 79, 0, 8, null);

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant40 = C3606v0.e(96, 93, 102, 0, 8, null);

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant50 = C3606v0.e(121, 116, 126, 0, 8, null);

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant60 = C3606v0.e(147, 143, 153, 0, 8, null);

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant70 = C3606v0.e(174, 169, 180, 0, 8, null);

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant80 = C3606v0.e(202, 196, 208, 0, 8, null);

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant90 = C3606v0.e(231, 224, 236, 0, 8, null);

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant95 = C3606v0.e(245, 238, 250, 0, 8, null);

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private static final long NeutralVariant99 = C3606v0.e(255, 251, 254, 0, 8, null);

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary0 = C3606v0.e(0, 0, 0, 0, 8, null);

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary10 = C3606v0.e(33, 0, 93, 0, 8, null);

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary100 = C3606v0.e(255, 255, 255, 0, 8, null);

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary20 = C3606v0.e(56, 30, 114, 0, 8, null);

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary30 = C3606v0.e(79, 55, 139, 0, 8, null);

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary40 = C3606v0.e(103, 80, 164, 0, 8, null);

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary50 = C3606v0.e(127, 103, 190, 0, 8, null);

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary60 = C3606v0.e(154, 130, 219, 0, 8, null);

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary70 = C3606v0.e(182, 157, 248, 0, 8, null);

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary80 = C3606v0.e(208, 188, 255, 0, 8, null);

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary90 = C3606v0.e(234, 221, 255, 0, 8, null);

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary95 = C3606v0.e(246, 237, 255, 0, 8, null);

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary99 = C3606v0.e(255, 251, 254, 0, 8, null);

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary0 = C3606v0.e(0, 0, 0, 0, 8, null);

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary10 = C3606v0.e(29, 25, 43, 0, 8, null);

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary100 = C3606v0.e(255, 255, 255, 0, 8, null);

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary20 = C3606v0.e(51, 45, 65, 0, 8, null);

    /* renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary30 = C3606v0.e(74, 68, 88, 0, 8, null);

    /* renamed from: s0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary40 = C3606v0.e(98, 91, 113, 0, 8, null);

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary50 = C3606v0.e(122, 114, 137, 0, 8, null);

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary60 = C3606v0.e(149, 141, 165, 0, 8, null);

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary70 = C3606v0.e(176, 167, 192, 0, 8, null);

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary80 = C3606v0.e(204, 194, 220, 0, 8, null);

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary90 = C3606v0.e(232, 222, 248, 0, 8, null);

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary95 = C3606v0.e(246, 237, 255, 0, 8, null);

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary99 = C3606v0.e(255, 251, 254, 0, 8, null);

    /* renamed from: A0, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary0 = C3606v0.e(0, 0, 0, 0, 8, null);

    /* renamed from: B0, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary10 = C3606v0.e(49, 17, 29, 0, 8, null);

    /* renamed from: C0, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary100 = C3606v0.e(255, 255, 255, 0, 8, null);

    /* renamed from: D0, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary20 = C3606v0.e(73, 37, 50, 0, 8, null);

    /* renamed from: E0, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary30 = C3606v0.e(99, 59, 72, 0, 8, null);

    /* renamed from: F0, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary40 = C3606v0.e(125, 82, 96, 0, 8, null);

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary50 = C3606v0.e(152, Temperature.MAX_INTERNAL_SECOND_GEN_PROBE, 119, 0, 8, null);

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary60 = C3606v0.e(181, 131, 146, 0, 8, null);

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary70 = C3606v0.e(210, 157, 172, 0, 8, null);

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary80 = C3606v0.e(239, 184, 200, 0, 8, null);

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary90 = C3606v0.e(255, 216, 228, 0, 8, null);

    /* renamed from: L0, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary95 = C3606v0.e(255, 236, 241, 0, 8, null);

    /* renamed from: M0, reason: collision with root package name and from kotlin metadata */
    private static final long Tertiary99 = C3606v0.e(255, 251, 250, 0, 8, null);

    /* renamed from: N0, reason: collision with root package name and from kotlin metadata */
    private static final long White = C3606v0.e(255, 255, 255, 0, 8, null);

    private k() {
    }

    public final long A() {
        return Secondary100;
    }

    public final long B() {
        return Secondary30;
    }

    public final long C() {
        return Secondary40;
    }

    public final long D() {
        return Secondary80;
    }

    public final long E() {
        return Secondary90;
    }

    public final long F() {
        return Tertiary10;
    }

    public final long G() {
        return Tertiary100;
    }

    public final long H() {
        return Tertiary30;
    }

    public final long I() {
        return Tertiary40;
    }

    public final long J() {
        return Tertiary80;
    }

    public final long K() {
        return Tertiary90;
    }

    public final long a() {
        return Error10;
    }

    public final long b() {
        return Error100;
    }

    public final long c() {
        return Error40;
    }

    public final long d() {
        return Error90;
    }

    public final long e() {
        return Neutral0;
    }

    public final long f() {
        return Neutral10;
    }

    public final long g() {
        return Neutral100;
    }

    public final long h() {
        return Neutral20;
    }

    public final long i() {
        return Neutral87;
    }

    public final long j() {
        return Neutral90;
    }

    public final long k() {
        return Neutral92;
    }

    public final long l() {
        return Neutral94;
    }

    public final long m() {
        return Neutral95;
    }

    public final long n() {
        return Neutral96;
    }

    public final long o() {
        return Neutral98;
    }

    public final long p() {
        return NeutralVariant30;
    }

    public final long q() {
        return NeutralVariant50;
    }

    public final long r() {
        return NeutralVariant80;
    }

    public final long s() {
        return NeutralVariant90;
    }

    public final long t() {
        return Primary10;
    }

    public final long u() {
        return Primary100;
    }

    public final long v() {
        return Primary30;
    }

    public final long w() {
        return Primary40;
    }

    public final long x() {
        return Primary80;
    }

    public final long y() {
        return Primary90;
    }

    public final long z() {
        return Secondary10;
    }
}
