package techproed.utilities;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ListenersRetryAnalyzer implements IAnnotationTransformer {
   //Bu sınıfın amacı tum FAİL test caseleri bir kez daha otomatik olarak run etmek...
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        //Bu sınıf ListenersRetry Util Classına baglıdır
   annotation.setRetryAnalyzer(ListenersRetry.class);
    }
}
