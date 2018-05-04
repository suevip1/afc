package rebue.afc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.afc.mo.AfcFlowMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface AfcFlowMapper extends MybatisBaseMapper<AfcFlowMo, Long> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_FLOW
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_FLOW
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    int insert(AfcFlowMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_FLOW
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    int insertSelective(AfcFlowMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_FLOW
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    AfcFlowMo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_FLOW
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    int updateByPrimaryKeySelective(AfcFlowMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_FLOW
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    int updateByPrimaryKey(AfcFlowMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_FLOW
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    List<AfcFlowMo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_FLOW
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    List<AfcFlowMo> selectSelective(AfcFlowMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_FLOW
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    boolean existByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_FLOW
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    boolean existSelective(AfcFlowMo record);
}