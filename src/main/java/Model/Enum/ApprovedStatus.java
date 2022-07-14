package Model.Enum;

import java.util.List;
import java.util.Random;

public enum ApprovedStatus {
    APPROVED, DISAPPROVED, PENDING;
    private static final List<ApprovedStatus> VALUES =
            List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static ApprovedStatus status()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
