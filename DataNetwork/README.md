# The Data Network Module

**Short**: Provides access to services through the network.

**Long**: Implements network access with AndroidAnnotations.

* **src/main**
    * **java** <br>
        Contains the implementation classes.
    * **res** <br>
        Contains the resources.

* **src/test** <br>
    Testing the presentation with robolectric support.

## Testing

The value for writing tests on this module is to proof the UI behavior.

There are different ways how this module may be tested and two basic ways which should be
taken in combination with the other test ways.

### Don't test it

You could take this decision because you will check this behavior on later test steps
which include more application modules or at real system tests.

### Basic: Driving the lifecycle with robolectric

Robolectric supports to take an activity and start it with lifecycle methods. This will give you
a simulated running application with headless ui. But you can access ui elements and invoke action
on them like click buttons, check title string, etc... This will slow down the test execution but

### Basic: Just invoke methods on objects

Just instantiate new class object inject some mocks and invoke methods to test. Will be very fast
but may need much time to create. E.g. onCreate() method will call super.onCreate() but this
method call will only work with "Drive lifecycle with robolectric" way. So you are forced to use
techniques like mockito spy to avoid errors.

### Use real Domain implementation

This way could drive into errors, which not belong to you. Missing network access, hard to prepare
test data, etc .. But it will give you the most real feedback if your implementation is correct. To
avoid some of the drawbacks you could inject mocked data modules.

### Mock the dependencies to the Domain (Current)

With dagger you have possibility to inject a mocked Domain module. Here you have big units, but
you could see the activity, fragment, presenter combination as a one unit because the extra classes
belongs to a micro architecture to get clean and maintainable code.

### Class with mocked dependencies

Common unit test style see also "Basic: Just invoke methods on objects"