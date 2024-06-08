package sample;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

/**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 *
 *
 package sample;

 import java.time.LocalDate;
 import java.util.Collection;
 import java.util.List;

 /**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 *
 * Implement in single class. Don't chane constructor and signature method.
 */
public class DateSorter {

    private static final Set<Month> monthWithR = EnumSet.of(JANUARY, FEBRUARY, MARCH, APRIL, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER);

    private static final Comparator<LocalDate> dateOrder = (o1, o2) -> {
        boolean o1HasR = R_MONTHS.contains(o1.getMonth());
        boolean o2HasR = R_MONTHS.contains(o2.getMonth());

        if (o1HasR) {
            return o2HasR ? o1.compareTo(o2) : -1;
        } else {
            return o2HasR ? o2.compareTo(o1) : 1;
        }
    };

    /**
     * The implementation of this method should sort dates.
     * The output should be in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2004-07-01, 2005-01-02, 2007-01-01, 2032-05-03)
     * would sort to
     * (2005-01-02, 2007-01-01, 2032-05-03, 2004-07-01)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        SortedSet<LocalDate> sortedDates = new TreeSet<>(R_DATE_ORDER);
        sortedDates.addAll(unsortedDates);
        return sortedDates;
    }
}