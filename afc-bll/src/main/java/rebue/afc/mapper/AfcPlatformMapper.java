package rebue.afc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.afc.mo.AfcPlatformMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface AfcPlatformMapper extends MybatisBaseMapper<AfcPlatformMo, Long> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PLATFORM
     *
     * @mbg.generated 2018-05-03 13:37:38
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PLATFORM
     *
     * @mbg.generated 2018-05-03 13:37:38
     */
    int insert(AfcPlatformMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PLATFORM
     *
     * @mbg.generated 2018-05-03 13:37:38
     */
    int insertSelective(AfcPlatformMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PLATFORM
     *
     * @mbg.generated 2018-05-03 13:37:38
     */
    AfcPlatformMo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PLATFORM
     *
     * @mbg.generated 2018-05-03 13:37:38
     */
    int updateByPrimaryKeySelective(AfcPlatformMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PLATFORM
     *
     * @mbg.generated 2018-05-03 13:37:38
     */
    int updateByPrimaryKey(AfcPlatformMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PLATFORM
     *
     * @mbg.generated 2018-05-03 13:37:38
     */
    List<AfcPlatformMo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PLATFORM
     *
     * @mbg.generated 2018-05-03 13:37:38
     */
    List<AfcPlatformMo> selectSelective(AfcPlatformMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PLATFORM
     *
     * @mbg.generated 2018-05-03 13:37:38
     */
    boolean existByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PLATFORM
     *
     * @mbg.generated 2018-05-03 13:37:38
     */
    boolean existSelective(AfcPlatformMo record);
}