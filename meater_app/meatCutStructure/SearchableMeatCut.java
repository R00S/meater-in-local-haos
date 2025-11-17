package com.apptionlabs.meater_app.meatCutStructure;

import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import f8.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/meat/meat/classes.dex */
public class SearchableMeatCut extends MeatCut implements Comparable<SearchableMeatCut> {
    private static final String DASH_SEPARATOR = " - ";
    private static final String FORMAT_SECTION_3 = "%s%s%s%s%s";
    private static final String SPACE = " ";
    private String searchPhraseAZ;
    private String searchPath = "";
    private final List<String> searchParts = new ArrayList();

    private boolean isSameText(String str, String str2) {
        if (str != null && str.equalsIgnoreCase(str2)) {
            return true;
        }
        return false;
    }

    public MeatCutsHelper.SearchResult contains(List<String> list) {
        String str;
        if (this.searchPhraseAZ != null && list != null && list.size() != 0) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (!this.searchPhraseAZ.contains(it.next())) {
                    return MeatCutsHelper.SearchResult.NOT_FOUND;
                }
            }
            MeatCutsHelper.SearchResult searchResult = MeatCutsHelper.SearchResult.FOUND_CONTAINS;
            StringBuilder sb = new StringBuilder();
            for (String str2 : this.searchParts) {
                if (str2 != null && !str2.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder(str2);
                    for (String str3 : list) {
                        int indexOf = b0.h(sb2.toString()).toLowerCase().indexOf(str3);
                        if (indexOf >= 0) {
                            sb2.insert(str3.length() + indexOf, "</b>");
                            sb2.insert(indexOf, "<b>");
                            if (indexOf == 0) {
                                searchResult = MeatCutsHelper.SearchResult.FOUND_STARTS_WITH;
                            }
                        }
                    }
                    if (sb.length() == 0) {
                        str = sb2.toString();
                    } else {
                        str = DASH_SEPARATOR + sb2.toString();
                    }
                    sb.append(str);
                }
            }
            this.searchPath = sb.toString();
            return searchResult;
        }
        return MeatCutsHelper.SearchResult.NOT_FOUND;
    }

    public String getParentPath() {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < this.searchParts.size(); i10++) {
            String str = this.searchParts.get(i10);
            if (i10 == 2) {
                break;
            }
            if (sb.length() != 0) {
                str = DASH_SEPARATOR + str;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.searchParts) {
            if (sb.length() != 0) {
                str = DASH_SEPARATOR + str;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public String getPathResult() {
        return this.searchPath;
    }

    public SearchableMeatCut init() {
        Meat meat;
        MeatCategory meatCategory;
        MeatCutType meatCutType = this.cutType;
        if (meatCutType != null && (meat = meatCutType.meat) != null && (meatCategory = meat.category) != null) {
            String name = meatCategory.getName();
            String name2 = meat.getName();
            if (meatCategory.getName().equalsIgnoreCase(meat.getName())) {
                name = meat.getName();
                name2 = this.cutType.getName();
            }
            this.searchParts.clear();
            this.searchParts.add(name);
            if (!isSameText(name, name2)) {
                this.searchParts.add(b0.b(name2).trim());
            }
            if (!isSameText(name2, getName())) {
                this.searchParts.add(getName());
            }
            this.searchPhraseAZ = String.format(FORMAT_SECTION_3, b0.f(name), SPACE, b0.f(name2), SPACE, b0.f(this.name));
        }
        return this;
    }

    @Override // java.lang.Comparable
    public int compareTo(SearchableMeatCut searchableMeatCut) {
        return this.searchPhraseAZ.compareTo(searchableMeatCut.searchPhraseAZ);
    }
}
