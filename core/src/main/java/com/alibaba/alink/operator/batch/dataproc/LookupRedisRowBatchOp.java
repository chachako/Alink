package com.alibaba.alink.operator.batch.dataproc;

import org.apache.flink.ml.api.misc.param.Params;

import com.alibaba.alink.common.annotation.NameCn;
import com.alibaba.alink.common.annotation.NameEn;
import com.alibaba.alink.common.annotation.SelectedColsWithFirstInputSpec;
import com.alibaba.alink.operator.batch.utils.MapBatchOp;
import com.alibaba.alink.operator.common.dataproc.LookupRedisMapper;
import com.alibaba.alink.params.dataproc.LookupRedisParams;

/**
 * batch op for lookup from redis.
 */
@SelectedColsWithFirstInputSpec
@NameCn("Redis 表查找Row类型")
@NameEn("Lookup Redis Table For Row")
public class LookupRedisRowBatchOp extends MapBatchOp <LookupRedisRowBatchOp>
	implements LookupRedisParams <LookupRedisRowBatchOp> {

	public LookupRedisRowBatchOp() {
		this(new Params());
	}

	public LookupRedisRowBatchOp(Params params) {
		super(LookupRedisMapper::new, params);
	}

}
