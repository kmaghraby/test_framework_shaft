package commons.annotations.retry;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

@Slf4j
@Getter
public class Retry implements IRetryAnalyzer {
    private boolean isRerun = false;
    private int retryCount = 0;

    @Setter
    private int maxRetryCount = 1;

    public boolean retry(ITestResult result) {
        log.info("Retry: {}", retryCount);
        if (retryCount < maxRetryCount) {
            retryCount++;
            isRerun = true;
            return true;
        }
        isRerun = false;
        log.info("Resetting retry count");
        retryCount = 0;
        return false;
    }
}
