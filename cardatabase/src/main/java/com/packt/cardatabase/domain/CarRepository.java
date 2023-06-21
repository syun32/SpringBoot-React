package com.packt.cardatabase.domain;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car, Long> {
    // SQL문을 이용해 브랜드로 자동차를 검색
    @Query("select c from Car c where c.brand like %?1")
    // 브랜드로 자동차를 검색
    List<Car> findByBrand(@Param("brand") String brand);

    // 색상으로 자동차를 검색
    List<Car> findByColor(@Param("color") String color);

    // 연도로 자동차를 검색
    List<Car> findByYear(int year);

    /* By 키워드 다음 And 및 Or 키워드 : 여러 필드 저장 */
    // 브랜드와 모델로 자동차를 검색
    List<Car> findByBrandAndModel(String brand, String model);

    // 브랜드나 색상으로 자동차를 검색
    List<Car> findByBrandOrColor(String brand, String color);

    /* OrderBy 키워드 : 쿼리 정렬 */
    // 브랜드로 자동차를 검색하고 연도로 정렬
    List<Car> findByBrandOrderByYearAsc(String brand);
}
