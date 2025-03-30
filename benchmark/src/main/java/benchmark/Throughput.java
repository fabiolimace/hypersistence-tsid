
package benchmark;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;

import io.hypersistence.tsid.TSID;

@Fork(1)
@Threads(4)
@State(Scope.Benchmark)
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 5, time = 3)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class Throughput {

	@Benchmark
	public UUID UUID_randomUUID() {
		return UUID.randomUUID();
	}

	@Benchmark
	public String UUID_randomUUID_toString() {
		return UUID.randomUUID().toString();
	}

	@Benchmark
	public TSID TSID_fast() {
		return TSID.fast();
	}

	@Benchmark
	public String TSID_fast_toString() {
		return TSID.fast().toString();
	}

	@Benchmark
	public TSID TSID_Factory_getTsid256() {
		return TSID.Factory.getTsid256();
	}

	@Benchmark
	public String TSID_Factory_getTsid256_toString() {
		return TSID.Factory.getTsid256().toString();
	}

	@Benchmark
	public TSID TSID_Factory_getTsid1024() {
		return TSID.Factory.getTsid1024();
	}

	@Benchmark
	public String TSID_Factory_getTsid1024_toString() {
		return TSID.Factory.getTsid1024().toString();
	}

	@Benchmark
	public TSID TSID_Factory_getTsid4096() {
		return TSID.Factory.getTsid4096();
	}

	@Benchmark
	public String TSID_Factory_getTsid4096_toString() {
		return TSID.Factory.getTsid4096().toString();
	}
}
