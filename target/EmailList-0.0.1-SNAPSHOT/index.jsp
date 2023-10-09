<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="./header.html" />
<h1>Join our email list</h1>
<p>To join our email list, enter your name and email address below.</p>
<c:if test="${message != null}">
  <p><i>${message}</i></p>
</c:if>
<form action="emailList" method="post" onsubmit="return validateForm();"> 
  <input type="hidden" name="action" value="add" />
  <label class="pad_top">Email:</label>
  <input type="email" name="email" value="${user.email}" required /><br />
  <label class="pad_top">First Name:</label>
  <input
    type="text"
    name="firstName"
    value="${user.firstName}"
    required
  /><br />
  <label class="pad_top">Last Name:</label>
  <input type="text" name="lastName" value="${user.lastName}" required /><br />
  <label class="pad_top">Date of Birth:</label>
  <input type="date" name="dateOfBirth" required /><br />

  <h3>How did you hear about us?</h3>
  <input
    type="radio"
    id="search_engine"
    name="how"
    value="Search engine"
    checked
  />Search engine
  <input type="radio" id="word_of_mouth" name="how" value="Word of mouth" />Word
  of mouth
  <input type="radio" id="social_media" name="how" value="Social media" />Social
  media <input type="radio" id="other" name="how" value="Other" /> Other

  <h3>
    Would you like to receive announcements about new CDs and special offers?
  </h3>
  <input type="checkbox" id="yes1" name="yes" value="Yes, I'd like that" />
  Yes, I'd like that <br />
  <input
    type="checkbox"
    id="yes2"
    name="yes"
    value="Yes, please send me email announcement"
    
  />
  Yes, please send me email announcement <br />

  <p>
    <label for="contact">Please contact me by:</label>

    <select name="contact" id="contact">
      <option value="Email or portal email">Email or portal email</option>
      <option value="Email only">Email only</option>
      <option value="Portal email only">Portal email only</option>
    </select>
  </p>

  <label>&nbsp;</label>
  <input type="submit" value="Join Now" class="margin_left" />
</form>

<script>
function validateForm() {
  // Check if at least one checkbox is selected
  var checkboxes = document.querySelectorAll('input[type="checkbox"][name="yes"]');
  var atLeastOneChecked = false;

  for (var i = 0; i < checkboxes.length; i++) {
    if (checkboxes[i].checked) {
      atLeastOneChecked = true;
      break;
    }
  }

  if (!atLeastOneChecked) {
    alert("Please select at least one checkbox.");
    return false; // Prevent form submission
  }

  return true; // Allow form submission
}
</script>


<c:import url="/footer.jsp" />
