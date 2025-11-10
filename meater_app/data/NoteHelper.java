package com.apptionlabs.meater_app.data;

import com.apptionlabs.meater_app.model.CookNote;
import com.google.gson.e;
import com.google.gson.l;
import f8.l0;
import java.text.ParseException;
import java.util.Date;
import kotlin.Metadata;
import wh.m;

/* compiled from: NoteHelper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lcom/apptionlabs/meater_app/data/NoteHelper;", "", "", "updatedAt", "", "stringToLongDate", "Lcom/google/gson/l;", "dictionary", "Lcom/apptionlabs/meater_app/model/CookNote;", "getNoteFromJson", "<init>", "()V", "NoteData", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class NoteHelper {
    public static final NoteHelper INSTANCE = new NoteHelper();

    /* compiled from: NoteHelper.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\b¨\u0006&"}, d2 = {"Lcom/apptionlabs/meater_app/data/NoteHelper$NoteData;", "", "()V", "cookId", "", "getCookId", "()Ljava/lang/String;", "setCookId", "(Ljava/lang/String;)V", "id", "getId", "setId", "isDeleted", "", "()Z", "setDeleted", "(Z)V", "note", "getNote", "setNote", "timestamp", "", "getTimestamp", "()D", "setTimestamp", "(D)V", "type", "", "getType", "()I", "setType", "(I)V", "updatedAt", "getUpdatedAt", "setUpdatedAt", "getCookID", "", "getNoteID", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class NoteData {
        private String cookId;
        private String id;
        private boolean isDeleted;
        private String note;
        private double timestamp;
        private int type;
        private String updatedAt;

        public final long getCookID() {
            return l0.s(this.cookId);
        }

        public final String getCookId() {
            return this.cookId;
        }

        public final String getId() {
            return this.id;
        }

        public final String getNote() {
            return this.note;
        }

        public final long getNoteID() {
            return l0.s(this.id);
        }

        public final double getTimestamp() {
            return this.timestamp;
        }

        public final int getType() {
            return this.type;
        }

        public final String getUpdatedAt() {
            return this.updatedAt;
        }

        /* renamed from: isDeleted, reason: from getter */
        public final boolean getIsDeleted() {
            return this.isDeleted;
        }

        public final void setCookId(String str) {
            this.cookId = str;
        }

        public final void setDeleted(boolean z10) {
            this.isDeleted = z10;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setNote(String str) {
            this.note = str;
        }

        public final void setTimestamp(double d10) {
            this.timestamp = d10;
        }

        public final void setType(int i10) {
            this.type = i10;
        }

        public final void setUpdatedAt(String str) {
            this.updatedAt = str;
        }
    }

    private NoteHelper() {
    }

    private final long stringToLongDate(String updatedAt) {
        if (updatedAt == null) {
            return 0L;
        }
        try {
            Date mEATERServerDateFormat = DateExtensionKt.toMEATERServerDateFormat(updatedAt);
            if (mEATERServerDateFormat == null) {
                return 0L;
            }
            return mEATERServerDateFormat.getTime();
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public final CookNote getNoteFromJson(l dictionary) {
        m.f(dictionary, "dictionary");
        NoteData noteData = (NoteData) new e().d(Integer.TYPE, new IntTypeAdapter()).d(Long.TYPE, new LongTypeAdapter()).b().i(dictionary.toString(), NoteData.class);
        CookNote cookNote = new CookNote();
        cookNote.noteID = noteData.getNoteID();
        cookNote.cookId = noteData.getCookId();
        cookNote.noteCookId = noteData.getCookID();
        cookNote.needsDeleting = noteData.getIsDeleted();
        cookNote.note = noteData.getNote();
        cookNote.timestamp = noteData.getTimestamp();
        cookNote.updatedAt = stringToLongDate(noteData.getUpdatedAt());
        cookNote.type = noteData.getType();
        return cookNote;
    }
}
