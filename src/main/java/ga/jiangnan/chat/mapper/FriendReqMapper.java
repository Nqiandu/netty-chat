package ga.jiangnan.chat.mapper;

import ga.jiangnan.chat.pojo.TbFriendReq;
import ga.jiangnan.chat.pojo.TbFriendReqExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FriendReqMapper {
    int countByExample(TbFriendReqExample example);

    int deleteByExample(TbFriendReqExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbFriendReq record);

    int insertSelective(TbFriendReq record);

    List<TbFriendReq> selectByExample(TbFriendReqExample example);

    TbFriendReq selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbFriendReq record, @Param("example") TbFriendReqExample example);

    int updateByExample(@Param("record") TbFriendReq record, @Param("example") TbFriendReqExample example);

    int updateByPrimaryKeySelective(TbFriendReq record);

    int updateByPrimaryKey(TbFriendReq record);
}