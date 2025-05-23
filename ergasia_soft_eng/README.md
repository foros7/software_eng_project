# Ergasia SoftEng

## Περιγραφή

Ένα απλό σύστημα διαχείρισης εργασιών και ραντεβού για φοιτητές, καθηγητές και γραμματεία, βασισμένο σε Java Servlet/JSP και Tomcat.

## Οδηγίες Εκτέλεσης

1. **Άνοιξε το project σε IDE (π.χ. IntelliJ IDEA, Eclipse) με Maven υποστήριξη.**
2. **Κάνε build το project (mvn clean package).**
3. **Ανέβασε το παραγόμενο war αρχείο στον Tomcat (webapps).**
4. **Άνοιξε browser και πήγαινε στο [http://localhost:8080/ergasia_soft_eng](http://localhost:8080/ergasia_soft_eng)**

## Default Credentials

- Γραμματεία: admin / admin
- Καθηγητής: prof / prof
- Φοιτητής: stud / stud

## Δομή

- `model/` : Κλάσεις μοντέλου
- `servlet/` : Servlets
- `webapp/` : JSPs και web αρχεία

## Επεκτάσεις

Μπορείς να προσθέσεις λειτουργικότητα για upload εργασιών, διαχείριση ραντεβού, κλπ, σύμφωνα με τα διαγράμματα.
