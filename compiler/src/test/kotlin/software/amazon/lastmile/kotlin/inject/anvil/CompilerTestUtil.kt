package software.amazon.lastmile.kotlin.inject.anvil

import java.lang.reflect.Method

internal val Class<*>.declaredNonSyntheticMethods: List<Method> get() = declaredMethods.filterNot {
    it.isSynthetic
}
