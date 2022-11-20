package support

import java.security.SecureRandom

class GeneratorContentId {

    companion object {
        // 추후에 Redis 동시성을 수정해볼까?
        private const val Bound = 1000

        fun generate(): String {
            return String.format(System.currentTimeMillis().toString() + "_" + SecureRandom().nextInt(Bound))
        }
    }
}
