package app

import org.slf4j.Logger
import org.slf4j.LoggerFactory

fun logger(lambda: () -> Unit): Lazy<Logger> = lazy { LoggerFactory.getLogger(getClassName(lambda.javaClass)) }
private fun <T : Any> getClassName(clazz: Class<T>): String = clazz.name.replace(Regex("""\$.*$"""), "")

val topLog by logger { }