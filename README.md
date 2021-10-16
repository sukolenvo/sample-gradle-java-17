Sample project to highlight issue with gradle test. CI pass all checks and in production code failes
with following error:
```
Exception in thread "main" java.lang.reflect.InaccessibleObjectException: Unable to make field private final java.lang.Object java.util.Optional.value accessible: module java.base does not "opens java.util" to unnamed module @ce3f8730
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:354)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:297)
	at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:178)
	at java.base/java.lang.reflect.Field.setAccessible(Field.java:172)
	at com.google.gson.internal.reflect.UnsafeReflectionAccessor.makeAccessible(UnsafeReflectionAccessor.java:44)
	at com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.getBoundFields(ReflectiveTypeAdapterFactory.java:159)
	at com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.create(ReflectiveTypeAdapterFactory.java:102)
	at com.google.gson.Gson.getAdapter(Gson.java:458)
	at com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper.write(TypeAdapterRuntimeTypeWrapper.java:56)
	at com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter.write(MapTypeAdapterFactory.java:208)
	at com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter.write(MapTypeAdapterFactory.java:145)
	at com.google.gson.Gson.toJson(Gson.java:704)
	at com.google.gson.Gson.toJson(Gson.java:683)
	at com.google.gson.Gson.toJson(Gson.java:638)
	at com.google.gson.Gson.toJson(Gson.java:618)
	at WebController.buildJson(WebController.java:13)
	at WebController.main(WebController.java:17)
```