package com.example.data;


import com.example.robolectric.support.BaseRobolectricTestRunner;

import org.junit.runners.model.InitializationError;

/**
 * Robolectric Support
 * <p/>
 * Robolectric supports org.robolectric.Config.properties but this project setup does not support
 * loading files from resources folder in android studio https://github.com/evant/android-studio-unit-test-plugin/issues/4
 * <p/>
 * So do here:
 * <p/>
 * <li>Set default shadows for all tests</li>*
 * <li>Set default emulated SDK version</li>
 * <li>Set path to the android manifest file</li>
 * <p/>
 * -
 */
public class CustomRobolectricTestRunner extends BaseRobolectricTestRunner {

    @Override
    protected Class[] getClassesToShadow() {
        return new Class[0];
    }

    @Override
    protected Class[] getDefaultShadowClasses() {
        return new Class[0];
    }

    public CustomRobolectricTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }
}
