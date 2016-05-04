package ${package}.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AuthMapper {

	@Select("select 1 as t union all select 2 union all select 3")
	List<Integer> generateQueue();

	@Select("select 'ROLE1' as t union all select 'ROLE2'")
	List <String> findRolesByAdminId(Long accountId);
}
