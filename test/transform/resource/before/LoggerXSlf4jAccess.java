import lombok.AccessLevel;
import lombok.extern.slf4j.XSlf4j;

@XSlf4j(access = AccessLevel.PUBLIC)
class LoggerXSlf4jAccessPublic {
}

@XSlf4j(access = AccessLevel.PROTECTED)
class LoggerXSlf4jAccessProtected {
}

@XSlf4j(access = AccessLevel.PACKAGE)
class LoggerXSlf4jAccessPackage {
}

@XSlf4j(access = AccessLevel.PRIVATE)
class LoggerXSlf4jAccessPrivate {
}

@XSlf4j(access = AccessLevel.NONE)
class LoggerXSlf4jAccessNone {
}
