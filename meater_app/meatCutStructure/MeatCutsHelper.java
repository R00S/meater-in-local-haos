package com.apptionlabs.meater_app.meatCutStructure;

import android.content.Context;
import android.graphics.Color;
import com.apptionlabs.meater_app.app.a;
import com.apptionlabs.meater_app.data.Config;
import com.google.gson.c;
import com.google.gson.e;
import f8.b0;
import f8.q0;
import id.i0;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MeatCutsHelper {
    public static final float DEFAULT_ANIMATION_OVERSHOOT_SCALE = 2.0f;
    private static final String KEY_NAME_BEEF = "beef";
    private static MeatCutsHelper self;
    private MeatCuts mMeatCuts;
    private final int ANIMAL_CUTS_WITH_ZERO_CUT_ID = 0;
    private final Map<Integer, Meat> mAnimalMap = new HashMap();
    private final Map<Integer, SearchableMeatCut> mCutMap = new HashMap();
    private final String CUSTOM_COOK_COLOR = "#CF0A0E";
    private final int MIN_SMOKE_TEMPERATURE = 90;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper$1, reason: invalid class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$meatCutStructure$MeatCutsHelper$SearchResult;

        static {
            int[] iArr = new int[SearchResult.values().length];
            $SwitchMap$com$apptionlabs$meater_app$meatCutStructure$MeatCutsHelper$SearchResult = iArr;
            try {
                iArr[SearchResult.FOUND_STARTS_WITH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$meatCutStructure$MeatCutsHelper$SearchResult[SearchResult.FOUND_CONTAINS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum SearchResult {
        FOUND_STARTS_WITH,
        FOUND_CONTAINS,
        NOT_FOUND
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum TemperatureSateInRanges {
        ABOVE,
        IN_RANGE,
        BELOW
    }

    private ArrayList<Integer> countryExcludedCutIds(String str) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (getMeatCuts().localeExclusions.get(str.toUpperCase()) == null) {
            str = "US";
        }
        ArrayList<MeatLocaleExclusion> arrayList2 = getMeatCuts().localeExclusions.get(str.toUpperCase());
        if (arrayList2 != null) {
            for (MeatLocaleExclusion meatLocaleExclusion : arrayList2) {
                Integer num = meatLocaleExclusion.cutId;
                if (num != null && num.intValue() > 0) {
                    arrayList.add(meatLocaleExclusion.cutId);
                }
            }
        }
        return arrayList;
    }

    private int findMinimumOrMaximumTemperatureOfGivenRanges(List<MeatCookingTemperature> list, boolean z10) {
        int i10;
        Integer num;
        Integer num2;
        if (z10) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = Integer.MIN_VALUE;
        }
        boolean T1 = a.u().T1();
        for (MeatCookingTemperature meatCookingTemperature : list) {
            if (z10) {
                if (T1) {
                    num = meatCookingTemperature.minTempF;
                } else {
                    num = meatCookingTemperature.minTempC;
                }
                i10 = Math.min(i10, num.intValue());
            } else {
                if (T1) {
                    num2 = meatCookingTemperature.maxTempF;
                } else {
                    num2 = meatCookingTemperature.maxTempC;
                }
                i10 = Math.max(i10, num2.intValue());
            }
        }
        return i10;
    }

    private List<MeatCutType> getFilteredCutTypesByCountry(String str, Collection<MeatCutType> collection) {
        ArrayList arrayList = new ArrayList();
        for (MeatCutType meatCutType : collection) {
            if (getFilteredCutsByCountry(str, meatCutType.cuts).size() > 0) {
                arrayList.add(meatCutType);
            }
        }
        return arrayList;
    }

    public static MeatCutsHelper getInstance() {
        if (self == null) {
            self = new MeatCutsHelper();
        }
        return self;
    }

    public boolean categoryHasMoreThenOneAnimal(int i10) {
        MeatCategory category = getCategory(i10);
        if (category != null && category.meats.size() > 1) {
            return true;
        }
        return false;
    }

    public void clear() {
        this.mMeatCuts = null;
        this.mCutMap.clear();
    }

    public boolean containsCategoryUSDA(MeatCut meatCut) {
        if (meatCut != null) {
            Iterator<MeatCookingTemperature> it = meatCut.temperatureRanges.iterator();
            while (it.hasNext()) {
                if (rangeIsUSDA(meatCut, it.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public List<MeatCookingTemperature> filterRangesOnValidNameDescription(List<MeatCookingTemperature> list, Context context) {
        ArrayList arrayList = new ArrayList();
        for (MeatCookingTemperature meatCookingTemperature : list) {
            if (b0.c(meatCookingTemperature.name, false) != null && b0.c(meatCookingTemperature.description, false) != null && q0.b(context, meatCookingTemperature.imageName) > 0) {
                arrayList.add(meatCookingTemperature);
            }
        }
        return arrayList;
    }

    public MeatCookingTemperature findMinimumOrMaximumRangeInGivenRanges(List<MeatCookingTemperature> list, boolean z10) {
        MeatCookingTemperature meatCookingTemperature = null;
        for (MeatCookingTemperature meatCookingTemperature2 : list) {
            if (z10) {
                if (meatCookingTemperature != null && meatCookingTemperature.minTempC.intValue() < meatCookingTemperature2.minTempC.intValue()) {
                }
                meatCookingTemperature = meatCookingTemperature2;
            } else {
                if (meatCookingTemperature != null && meatCookingTemperature.minTempC.intValue() > meatCookingTemperature2.minTempC.intValue()) {
                }
                meatCookingTemperature = meatCookingTemperature2;
            }
        }
        return meatCookingTemperature;
    }

    public float getAnimationScale(MeatCut meatCut) {
        if (meatCut != null && !meatCut.temperatureRanges.isEmpty() && highestNonSmokePreset(meatCut.temperatureRanges) != null) {
            int intValue = (100 / highestNonSmokePreset(meatCut.temperatureRanges).maxTempC.intValue()) * meatCut.temperatureRanges.get(0).maxTempC.intValue();
            if (intValue >= 85) {
                return 1.05f;
            }
            if (intValue >= 80) {
                return 1.1f;
            }
            if (intValue >= 70) {
                return 1.2f;
            }
            if (intValue <= 50) {
                return 3.3f;
            }
            if (intValue <= 60) {
                return 3.0f;
            }
        }
        return 2.0f;
    }

    public List<MeatModel> getCategoriesBase() {
        if (this.mMeatCuts == null) {
            return new ArrayList();
        }
        return new ArrayList(this.mMeatCuts.categories);
    }

    public MeatCategory getCategory(int i10) {
        MeatCuts meatCuts = this.mMeatCuts;
        if (meatCuts == null) {
            return null;
        }
        Iterator<MeatCategory> it = meatCuts.categories.iterator();
        while (it.hasNext()) {
            MeatCategory next = it.next();
            if (next != null && next.id.intValue() == i10) {
                return next;
            }
        }
        return null;
    }

    public SearchableMeatCut getCutFromPresetId(int i10) {
        for (SearchableMeatCut searchableMeatCut : this.mCutMap.values()) {
            Iterator<MeatCookingTemperature> it = searchableMeatCut.temperatureRanges.iterator();
            while (it.hasNext()) {
                if (it.next().id.intValue() == i10) {
                    return searchableMeatCut;
                }
            }
        }
        return null;
    }

    public MeatCutType getCutType(int i10, int i11, int i12) {
        MeatCategory category;
        if (this.mMeatCuts != null && (category = getCategory(i10)) != null) {
            if (category.meats.size() == 1) {
                Iterator<MeatCutType> it = category.meats.get(0).cutTypes.iterator();
                while (it.hasNext()) {
                    MeatCutType next = it.next();
                    if (next.id.intValue() == i12) {
                        return next;
                    }
                }
            } else {
                Iterator<Meat> it2 = category.meats.iterator();
                while (it2.hasNext()) {
                    Meat next2 = it2.next();
                    if (next2 != null && next2.cutTypes.size() > 0 && next2.cutTypes.get(0).id.intValue() == i11) {
                        Iterator<MeatCutType> it3 = next2.cutTypes.iterator();
                        while (it3.hasNext()) {
                            MeatCutType next3 = it3.next();
                            if (i12 == 0 || next3.id.intValue() == i12) {
                                return next3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public List<Meat> getFilteredAnimalsByCountry(String str, ArrayList<Meat> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<Meat> it = arrayList.iterator();
        while (it.hasNext()) {
            Meat next = it.next();
            if (getFilteredCutTypesByCountry(str, next.cutTypes).size() > 0) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public ArrayList<SearchableMeatCut> getFilteredCutsByCountry(String str, Collection<SearchableMeatCut> collection) {
        ArrayList<Integer> countryExcludedCutIds = countryExcludedCutIds(str);
        if (countryExcludedCutIds != null && !countryExcludedCutIds.isEmpty()) {
            ArrayList<SearchableMeatCut> arrayList = new ArrayList<>();
            for (SearchableMeatCut searchableMeatCut : collection) {
                if (!countryExcludedCutIds.contains(searchableMeatCut.id)) {
                    arrayList.add(searchableMeatCut);
                }
            }
            return arrayList;
        }
        return new ArrayList<>(collection);
    }

    public List<MeatModel> getFilteredCutsByCountryBase(String str, Collection<SearchableMeatCut> collection) {
        return i0.h(getFilteredCutsByCountry(str, collection));
    }

    public Meat getFirstMeatOfCategory(int i10) {
        MeatCategory category = getCategory(i10);
        if (category != null) {
            return category.meats.get(0);
        }
        return null;
    }

    public int getIntMeatColor(int i10) {
        MeatCut meatCut = getMeatCut(i10);
        if (meatCut == null) {
            return Color.parseColor("#CF0A0E");
        }
        MeatCategory category = getCategory(meatCut.cutType.meat.category.id.intValue());
        if (category != null) {
            return Color.parseColor(category.colourHex);
        }
        return Color.parseColor("#CF0A0E");
    }

    public int getIntMeatIcon(int i10) {
        if (getMeatCut(i10) == null) {
            return 0;
        }
        return a.i().getResources().getIdentifier(getMeatIcon(i10).toLowerCase(), "drawable", a.i().getPackageName());
    }

    public int getMaxTemperature(MeatCookingTemperature meatCookingTemperature) {
        Integer num;
        if (meatCookingTemperature != null && meatCookingTemperature.isValidTemperatures()) {
            if (a.u().T1()) {
                num = meatCookingTemperature.maxTempF;
            } else {
                num = meatCookingTemperature.maxTempC;
            }
            return num.intValue();
        }
        return 0;
    }

    public String getMeatColor(int i10) {
        MeatCategory category;
        MeatCut meatCut = getMeatCut(i10);
        if (meatCut == null || (category = getCategory(meatCut.cutType.meat.category.id.intValue())) == null) {
            return "#CF0A0E";
        }
        return category.colourHex;
    }

    public MeatCut getMeatCut(int i10) {
        return this.mCutMap.get(Integer.valueOf(i10));
    }

    public MeatCuts getMeatCuts() {
        return this.mMeatCuts;
    }

    public String getMeatIcon(int i10) {
        MeatCut meatCut = getMeatCut(i10);
        if (meatCut != null) {
            return meatCut.cutType.meat.category.imageName;
        }
        return "meat";
    }

    public Meat getMeatType(int i10, int i11) {
        Iterator<Meat> it = getCategory(i10).meats.iterator();
        while (it.hasNext()) {
            Meat next = it.next();
            if (next != null && next.id.intValue() == i11) {
                return next;
            }
        }
        return null;
    }

    public int getMinTemperature(MeatCookingTemperature meatCookingTemperature) {
        Integer num;
        if (meatCookingTemperature != null && meatCookingTemperature.isValidTemperatures()) {
            if (a.u().T1()) {
                num = meatCookingTemperature.minTempF;
            } else {
                num = meatCookingTemperature.minTempC;
            }
            return num.intValue();
        }
        return 0;
    }

    public MeatCookingTemperature getPresetFromId(List<MeatCookingTemperature> list, int i10) {
        for (MeatCookingTemperature meatCookingTemperature : list) {
            if (meatCookingTemperature.id.intValue() == i10) {
                return meatCookingTemperature;
            }
        }
        return null;
    }

    public MeatCookingTemperature getRangeFromTemperature(int i10, List<MeatCookingTemperature> list) {
        for (MeatCookingTemperature meatCookingTemperature : list) {
            if (inRange(i10, meatCookingTemperature)) {
                return meatCookingTemperature;
            }
        }
        return null;
    }

    public MeatCookingTemperature getRangeIfFoundWithOutMeaterRecommend(int i10, List<MeatCookingTemperature> list) {
        for (MeatCookingTemperature meatCookingTemperature : list) {
            if (!meatCookingTemperature.isMeaterRecommendRange() && inRange(i10, meatCookingTemperature)) {
                return meatCookingTemperature;
            }
        }
        return null;
    }

    public int getRangeIndex(List<MeatCookingTemperature> list, int i10) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11).id.intValue() == i10) {
                return i11;
            }
        }
        return -1;
    }

    public int getTargetTemperature(MeatCookingTemperature meatCookingTemperature) {
        Integer num;
        if (a.u().T1()) {
            num = meatCookingTemperature.targetTempF;
        } else {
            num = meatCookingTemperature.targetTempC;
        }
        return num.intValue();
    }

    public TemperatureSateInRanges getTemperaturePositionInCurrentRange(int i10, List<MeatCookingTemperature> list) {
        if (temperatureIsBelowOfFirstRange(i10, list)) {
            return TemperatureSateInRanges.BELOW;
        }
        if (temperatureIsAboveOfLastRange(i10, list)) {
            return TemperatureSateInRanges.ABOVE;
        }
        return TemperatureSateInRanges.IN_RANGE;
    }

    public ArrayList<MeatCookingTemperature> getTemperatureRangesHavingGradient(List<MeatCookingTemperature> list) {
        ArrayList<MeatCookingTemperature> arrayList = new ArrayList<>();
        for (MeatCookingTemperature meatCookingTemperature : list) {
            if (meatCookingTemperature != null && meatCookingTemperature.isNormalRange()) {
                arrayList.add(meatCookingTemperature);
            }
        }
        return arrayList;
    }

    public String getTemperatureString(MeatCookingTemperature meatCookingTemperature) {
        Integer num;
        Integer num2;
        if (meatCookingTemperature != null) {
            if (a.u().T1()) {
                num = meatCookingTemperature.minTempF;
            } else {
                num = meatCookingTemperature.minTempC;
            }
            if (a.u().T1()) {
                num2 = meatCookingTemperature.maxTempF;
            } else {
                num2 = meatCookingTemperature.maxTempC;
            }
            if (num != null && num2 != null) {
                return String.format(Locale.US, "%d-%d°", num, num2);
            }
            return "";
        }
        return "";
    }

    public boolean hasRecommends(MeatCut meatCut) {
        if (meatCut != null) {
            Iterator<MeatCookingTemperature> it = meatCut.temperatureRanges.iterator();
            while (it.hasNext()) {
                if (it.next().isMeaterRecommendRange()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public MeatCookingTemperature highestNonSmokePreset(List<MeatCookingTemperature> list) {
        MeatCookingTemperature meatCookingTemperature = null;
        for (MeatCookingTemperature meatCookingTemperature2 : list) {
            if (meatCookingTemperature == null || meatCookingTemperature2.targetTempC.intValue() > meatCookingTemperature.targetTempC.intValue()) {
                if (meatCookingTemperature2.targetTempC.intValue() < 90) {
                    meatCookingTemperature = meatCookingTemperature2;
                }
            }
        }
        return meatCookingTemperature;
    }

    public boolean inRange(int i10, MeatCookingTemperature meatCookingTemperature) {
        if (meatCookingTemperature != null && meatCookingTemperature.isValidTemperatures() && getMinTemperature(meatCookingTemperature) <= i10 && getMaxTemperature(meatCookingTemperature) >= i10) {
            return true;
        }
        return false;
    }

    public int indexOfCurrentRange(int i10, List<MeatCookingTemperature> list) {
        return indexOfCurrentRange(i10, false, list);
    }

    public void init(Context context) {
        if (this.mMeatCuts == null || this.mCutMap.isEmpty()) {
            InputStream openRawResource = context.getResources().openRawResource(2131951661);
            this.mCutMap.clear();
            MeatCuts meatCuts = (MeatCuts) new e().e(c.u).b().g(new InputStreamReader(openRawResource), MeatCuts.class);
            this.mMeatCuts = meatCuts;
            Iterator<MeatCategory> it = meatCuts.categories.iterator();
            while (it.hasNext()) {
                MeatCategory next = it.next();
                ArrayList arrayList = new ArrayList();
                Iterator<Meat> it2 = next.meats.iterator();
                while (it2.hasNext()) {
                    Meat next2 = it2.next();
                    next2.category = next;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<MeatCutType> it3 = next2.cutTypes.iterator();
                    while (it3.hasNext()) {
                        MeatCutType next3 = it3.next();
                        next3.meat = next2;
                        Iterator<SearchableMeatCut> it4 = next3.cuts.iterator();
                        while (it4.hasNext()) {
                            SearchableMeatCut next4 = it4.next();
                            next4.cutType = next3;
                            this.mCutMap.put(next4.id, next4.init());
                        }
                        if (next3.cuts.isEmpty()) {
                            arrayList2.add(next3);
                        }
                    }
                    next2.cutTypes.removeAll(arrayList2);
                    if (next2.cutTypes.isEmpty()) {
                        arrayList.add(next2);
                    } else {
                        this.mAnimalMap.put(next2.id, next2);
                    }
                }
                next.meats.removeAll(arrayList);
            }
        }
    }

    public boolean isBeef(int i10) {
        return isBeef(this.mCutMap.get(Integer.valueOf(i10)));
    }

    public boolean rangeIsUSDA(MeatCut meatCut, MeatCookingTemperature meatCookingTemperature) {
        Integer num;
        Integer num2;
        if (Config.getInstance().TEMPERATURE_RANGE_USDA_IF_WHOLE_RANGE_ABOVE_USDA) {
            Boolean bool = meatCookingTemperature.usdaSafe;
            if (bool == null || !bool.booleanValue()) {
                return false;
            }
            return true;
        }
        if (a.u().T1()) {
            if (meatCut == null || (num2 = meatCut.usdaSafeF) == null || num2.intValue() > meatCookingTemperature.targetTempF.intValue()) {
                return false;
            }
            return true;
        }
        if (meatCut == null || (num = meatCut.usdaSafeC) == null || num.intValue() > meatCookingTemperature.targetTempC.intValue()) {
            return false;
        }
        return true;
    }

    public List<SearchableMeatCut> search(String str) {
        return search(str, getInstance().getFilteredCutsByCountry(Locale.getDefault().getCountry(), this.mCutMap.values()));
    }

    public MeatCookingTemperature searchForRecipeRecommendedTemperature(List<MeatCookingTemperature> list, String str) {
        for (MeatCookingTemperature meatCookingTemperature : list) {
            if (meatCookingTemperature.name.equalsIgnoreCase(str)) {
                return meatCookingTemperature;
            }
        }
        return null;
    }

    public MeatCookingTemperature slightlyOverDonePresetForPreset(MeatCookingTemperature meatCookingTemperature, List<MeatCookingTemperature> list) {
        MeatCookingTemperature meatCookingTemperature2 = null;
        for (MeatCookingTemperature meatCookingTemperature3 : list) {
            if (meatCookingTemperature3.targetTempC.intValue() > meatCookingTemperature.targetTempC.intValue() && (meatCookingTemperature2 == null || meatCookingTemperature3.targetTempC.intValue() < meatCookingTemperature2.targetTempC.intValue())) {
                meatCookingTemperature2 = meatCookingTemperature3;
            }
        }
        return meatCookingTemperature2;
    }

    public boolean temperatureIsAboveOfLastRange(int i10, List<MeatCookingTemperature> list) {
        int findMinimumOrMaximumTemperatureOfGivenRanges = findMinimumOrMaximumTemperatureOfGivenRanges(list, false);
        if (findMinimumOrMaximumTemperatureOfGivenRanges == Integer.MIN_VALUE || findMinimumOrMaximumTemperatureOfGivenRanges > i10) {
            return false;
        }
        return true;
    }

    public boolean temperatureIsBelowOfFirstRange(int i10, List<MeatCookingTemperature> list) {
        int findMinimumOrMaximumTemperatureOfGivenRanges = findMinimumOrMaximumTemperatureOfGivenRanges(list, true);
        if (findMinimumOrMaximumTemperatureOfGivenRanges != Integer.MAX_VALUE && findMinimumOrMaximumTemperatureOfGivenRanges >= i10) {
            return true;
        }
        return false;
    }

    public int indexOfCurrentRange(int i10, boolean z10, List<MeatCookingTemperature> list) {
        Iterator<MeatCookingTemperature> it = list.iterator();
        int i11 = -1;
        int i12 = 0;
        while (it.hasNext()) {
            if (inRange(i10, it.next())) {
                if (z10) {
                    return i12;
                }
                i11 = i12;
            }
            i12++;
        }
        return i11;
    }

    public boolean isBeef(MeatCut meatCut) {
        MeatCutType meatCutType;
        return (meatCut == null || (meatCutType = meatCut.cutType) == null || !isBeef(meatCutType.meat)) ? false : true;
    }

    public List<SearchableMeatCut> search(String str, Collection<SearchableMeatCut> collection) {
        if (str != null && !str.trim().isEmpty() && collection != null && !collection.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : str.trim().split(" ")) {
                arrayList.add(b0.f(str2.trim()));
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (SearchableMeatCut searchableMeatCut : collection) {
                int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$meatCutStructure$MeatCutsHelper$SearchResult[searchableMeatCut.contains(arrayList).ordinal()];
                if (i10 == 1) {
                    arrayList2.add(searchableMeatCut);
                } else if (i10 == 2) {
                    arrayList3.add(searchableMeatCut);
                }
            }
            Collections.sort(arrayList2);
            Collections.sort(arrayList3);
            arrayList2.addAll(arrayList3);
            return arrayList2;
        }
        return new ArrayList();
    }

    public boolean isBeef(Meat meat) {
        return meat != null && meat.name.trim().equalsIgnoreCase(KEY_NAME_BEEF);
    }
}
