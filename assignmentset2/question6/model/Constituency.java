package corejava.collection.assignmentset2.question6.model;

public class Constituency {
    private Integer candidateId;
    private String candidateName;
    private String constituencyName;
    private Long votes;

    public Constituency(Integer candidateId, String candidateName, String constituencyName, Long votes) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.constituencyName = constituencyName;
        this.votes = votes;
    }

    public Constituency() {
    }

    public Integer getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Integer candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getConstituencyName() {
        return constituencyName;
    }

    public void setConstituencyName(String constituencyName) {
        this.constituencyName = constituencyName;
    }

    public Long getVotes() {
        return votes;
    }

    public void setVotes(Long votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        String placeHolder = "Candidate Id :{0}, Candidate Name: {1},Constituency Name:{2}, Votes: {3} ";
        return java.text.MessageFormat.format(placeHolder, candidateName, constituencyName, votes);
    }
}
