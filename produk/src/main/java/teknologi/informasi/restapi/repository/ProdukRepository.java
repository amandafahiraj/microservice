package teknologi.informasi.restapi.repository;

import teknologi.informasi.restapi.model.Produk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdukRepository extends JpaRepository<Produk, Long> {
}


