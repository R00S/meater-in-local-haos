package cm.aptoide.p092pt.reviews;

import android.content.res.Resources;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class LanguageFilterHelper {
    private final LanguageFilter all = new LanguageFilter(C1146R.string.reviewappview_short_comments_by_language_all, (List<String>) Collections.emptyList());
    private final String currentCountryCode;
    private final LanguageFilter currentLanguageFirst;
    private final LanguageFilter english;

    public enum LanguageCode {
        en_GB
    }

    public static class LanguageFilter {
        private final List<String> countryCodes;
        private int position;
        private final int stringId;

        LanguageFilter(int i2, String str) {
            this(i2, (List<String>) Collections.singletonList(str));
        }

        public List<String> getCountryCodes() {
            return this.countryCodes;
        }

        public int getPosition() {
            return this.position;
        }

        public int getStringId() {
            return this.stringId;
        }

        public String getValue() {
            if (this.countryCodes.size() > 0) {
                return this.countryCodes.get(this.position);
            }
            return null;
        }

        public boolean hasMoreCountryCodes() {
            return this.countryCodes.size() > this.position + 1;
        }

        public LanguageFilter inc() {
            this.position++;
            return this;
        }

        public void setPosition(int i2) {
            this.position = i2;
        }

        LanguageFilter(int i2, List<String> list) {
            this.position = 0;
            this.stringId = i2;
            this.countryCodes = list;
        }

        public LanguageFilter(LanguageFilter languageFilter) {
            this(languageFilter.getStringId(), languageFilter.getCountryCodes());
        }
    }

    public LanguageFilterHelper(Resources resources) {
        String countryCode = AptoideUtils.SystemU.getCountryCode(resources);
        this.currentCountryCode = countryCode;
        this.currentLanguageFirst = new LanguageFilter(C1146R.string.reviewappview_short_comments_by_language_current_language_first, (List<String>) (countryCode.startsWith("en") ? Arrays.asList(countryCode) : Arrays.asList(countryCode, LanguageCode.en_GB.toString())));
        this.english = new LanguageFilter(C1146R.string.reviewappview_short_comments_by_language_english, LanguageCode.en_GB.toString());
    }

    public LanguageFilter getAll() {
        return this.all;
    }

    public String getCurrentCountryCode() {
        return this.currentCountryCode;
    }

    public LanguageFilter getCurrentLanguageFirst() {
        return this.currentLanguageFirst;
    }

    public LanguageFilter getEnglish() {
        return this.english;
    }

    List<LanguageFilter> getLanguageFilterList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.all);
        linkedList.add(this.currentLanguageFirst);
        if (!this.currentCountryCode.startsWith("en")) {
            linkedList.add(this.english);
        }
        return linkedList;
    }
}
